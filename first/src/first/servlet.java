package first;
import javax.servlet.http.*;
public class servlet extends HttpServlet{
	

	public void init(){
		System.out.println("���뵹��init()����");
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		System.out.println("���뵽�� doGet����");
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response){
		
		System.out.println("���뵹�� doPost");
		String msg = request.getParameter("msg");
		System.out.println(msg);
	}
	public void destory(){
		System.out.println("���뵽�˵�story����");
	}
}
