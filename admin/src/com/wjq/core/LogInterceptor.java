package com.wjq.core;

import javax.servlet.ServletContext;

import static com.wjq.util.TzConstant.*;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import com.wjq.bean.AdminStat;
import com.wjq.bean.User;
import com.wjq.dao.adminStat.IAdminStatDao;
import com.wjq.service.adminStat.IAdminStatService;
import com.wjq.util.TmStringUtils;

 @Aspect
@Component 
public class LogInterceptor implements ServletContextAware{
	 
	private ServletContext application;
	@Autowired
	private IAdminStatService  adminStatService;
	@Around("execution(* com.wjq.service.*.*.*(..))")
	public Object doBasicProfiling(ProceedingJoinPoint point) throws Throwable{
		
		//��ȡ����ִ�еķ�����
		String MethodName = point.getSignature().getName();
		System.out.println(MethodName);
		//���û���¼��ʱ��  ֱ�ӷ���  ������¼
		if(TmStringUtils.isNotEmpty(MethodName)&&MethodName.equals("getLogin")){
			return point.proceed();
		}
		//����Ϊʲô�ǣ�object  ͨ�����������Ի�ȡ�������  getclass()
		Object classObj = point.getTarget();//���ص����� 
		//��ȡִ��ǰ��ʱ��
		long start = System.currentTimeMillis();
		//ִ�е��õķ���
		Object object = point.proceed();
		//��ȡִ�к��ʱ��
		long end = System.currentTimeMillis();
		//��ʱ��=��ʼ-����  �Ժ���Ϊ��λ
		long time = end -start ;
		//��ȡ���صķ����Ĳ���,�Զ����������ʽ����
		Object[] params = point.getArgs(); 
		StringBuilder stringbuilder = new StringBuilder("");
		if(params.length>0){
			for(int i = 0;i<params.length;i++){
				stringbuilder.append(String.valueOf(params[i]));
				if(i<params.length-1){
					stringbuilder.append(",");
				}
			} 
		}
	//	System.out.println("������");
		//ͨ��classobj��ȡ����
		String className = classObj.getClass().getName();
		//����ֵ����
		String resultType = null;
		if(object!=null){
			resultType = object.getClass().getName();
		}
		//�����ռǵ����ݿ� 
		saveLog(className,MethodName,time,resultType); 
		return object;
	}
	
	public void saveLog(String className,String MethodName,long time,String resultType){
		//�ڵ�½���ص�ʱ��Ͱ�request�Ž�ȥ�� 
		HttpServletRequest request= (HttpServletRequest) application.getAttribute("request_log");
		// ��ÿͻ��˵�ip��ַ ����������ӳ�䵽����ĵ�ַ
		System.out.println("request.getRemoteAddr(): " + request.getRemoteAddr());
		//��ÿͻ��˵������������Ե�����
		System.out.println("request.getRemoteHost(): " + request.getRemoteHost()); 
		User user = (User) request.getSession().getAttribute(SESSION_USER);
		System.out.println("userId"+user.getId());
		AdminStat adminstat = new AdminStat();
		adminstat.setResultType(resultType);
		adminstat.setClassName(className);
		adminstat.setIp(request.getRemoteAddr());
		adminstat.setIpAddress(request.getRemoteHost());
		adminstat.setMethod(MethodName);
		adminstat.setModel("model");
		adminstat.setTime(time);
		if(user!=null)
		adminstat.setUserId(user.getId());
		adminstat.setDescription("description"); 
		System.out.println("=====================");
		System.out.println(adminstat);
	//
		//adminStatService.save(adminstat); 
	}
	@Override
	public void setServletContext(ServletContext application) {
		this.application = application;
		System.out.println("ʲôʱ��ִ�е�");
	}
	
}
