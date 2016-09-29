package com.wjq.web;

import static com.wjq.util.TzConstant.SESSION_USER;
import static com.wjq.util.TzConstant.SESSION_USER_USERNAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wjq.bean.User;
import com.wjq.bean.WjqParams;
import com.wjq.core.BaseController;
import com.wjq.service.user.IUserService;
import com.wjq.util.TmStringUtils;


@Controller
public class LoginController extends BaseController{
	
	@Autowired
	IUserService userService;
	
	@RequestMapping("login")
	public String login(){
		System.out.println("login");
		return "login";
	}
	
	//������ʾ��ͨ���������������Է���ҳ����д���  ֱ�Ӱ�return���ַ�������ǰ̨��servlet��out.println()Ч����ͬ
	@ResponseBody
	@RequestMapping(value="logined")
	public String logined(WjqParams params){
		//ͨ������ �����Զ�ע������ ǰ��������Ҫһ��  ��  ��������
		if(params != null){
			if(TmStringUtils.isNotEmpty(params.getEmail())&&TmStringUtils.isNotEmpty(params.getPassword())){
				//params.setPassword(TmStringUtils.md5Base64(params.getPassword()));
				User user =userService.getLogin(params);
				if(user!=null){
					if(user.getForbiden()==1){
						//���˻���ֹ��¼
						return "forbiden";
					}else{
						session.setAttribute(SESSION_USER, user);
						session.setAttribute(SESSION_USER_USERNAME, user.getUsername());
						//��¼�ɹ�������ɹ���ҳ
						return "success";
					}
				}
				//�˻���/�������
				return "messageError";
			}
			//�˻���������û����д��������������д
			return "error";
		}else{
			//�˻���������û����д����������д
			return "error";
		}
	}
	
	//�ǳ���ɾ��session����
	@RequestMapping("logout")
	public String logout(){
		session.invalidate();
		return "redirect:login";
	}
}
