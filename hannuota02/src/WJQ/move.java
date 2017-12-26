package WJQ;

import java.io.IOException;

import javax.servlet.http.*;
import javax.servlet.*;

import java.io.*;
public class move extends HttpServlet{
	int[][] b_floors;
	public void init(){
		System.out.println("进入到了 moveServlet 的init方法");
		b_floors = new int[3][3];
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		
		HttpSession session = request.getSession();
		session.setAttribute("b_floors", b_floors);

		System.out.println("进入到了 moveServlet 的doGet方法");
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response){
		
	

			int block1 = Integer.parseInt(request.getParameter("block1"));
			int floor1 = Integer.parseInt(request.getParameter("floor1"));
			
			int block2 = Integer.parseInt(request.getParameter("block2"));
			int floor2 = Integer.parseInt(request.getParameter("floor2"));
			
			int block3 = Integer.parseInt(request.getParameter("block3"));
			int floor3 = Integer.parseInt(request.getParameter("floor3"));
			
			HttpSession session = request.getSession();
			
			int[][]b_floors = (int[][])session.getAttribute("b_floors");
			
			for(int j = 0;j<3;j++){
				for(int i = 0;i<3;i++){
						System.out.println(b_floors);
				};
			}//没有存储进去
			for(int j = 0;j<3;j++){
				for(int i = 0;i<3;i++){
						b_floors[j][i] = 0;
				};
			}//修改数据失败  怎么修改*/
			//session.setAttribute("b_floors", b_floors);
			//通过获取参数存储位置 信息
			for(int j = 0;j<3;j++){
				for(int i = 0;i<3;i++){
						System.out.println(b_floors[j][i]);
				};
			}
		System.out.println("进入到了 moveServlet 的doPost方法111");
		PrintWriter out;
		try {
			out = response.getWriter();
			
			out.println("<!doctype html>");
			out.println("<html lang=\"en\">");
			out.println(" <head>");
			out.println(" <meta charset=\"UTF-8\">");
			out.println(" <meta name=\"Generator\" content=\"EditPlus®\">");
			out.println(" <meta name=\"Author\" content=\"\">");
			out.println(" <meta name=\"Keywords\" content=\"\">");
			out.println("<meta name=\"Description\" content=\"\">");
			out.println(" <title>Document</title>");
			out.println(" <style>");
			out.println("	*{margin:0;padding:0;}");
			
			out.println(" </style>");
			out.println(" </head>");
			out.println(" <body>");
		
			out.println("<div class = \"loca\" style = \"width:300px;height:40px;position:absolute;top:400px;left:100px;background:blue;\"></div>");
			out.println("<div  class = \"loca\" style = \"width:300px;height:40px;position:absolute;top:400px;left:550px;background:blue;\"></div>");
			out.println("<div  class = \"loca\" style = \"width:300px;height:40px;position:absolute;top:400px;left:950px;background:blue;\"></div>");


			out.println("<div class =\"box\"  style = \"width:250px;height:40px;border:2px solid #000;background:red;position:absolute;\"></div>");
			out.println("<div class = \"box\"  style = \"width:150px;height:40px;border:2px solid #000;background:red;position:absolute;\"></div>");
			out.println("<div class = \"box\"  style = \"width:70px;height:40px;border:2px solid #000;background:red;position:absolute;\"></div>");
			out.println("	<form action = \"moveServlet\" method=\"post\">");
			//提交一次后  input 保留原始值   因为后面会存在  只有一个在移动的情况  所以 要为其他保留情况
			out.println("<input type = \"text\" name = \"user1\" class= \"in\"/>");
			out.println("<br />");
			out.println("<input type = \"text\" name = \"user2\" class= \"in\" />");
			out.println("<br />");
			out.println("<input type = \"text\" name = \"user3\" class= \"in\"  />");
			out.println("	<input type = \"submit\" value = \"提交\"  />");
			out.println("</form>");
			
			
		
			
				out.println("<script type = \"text/javascript\" >");
				
				out.println("var block1 = "+ block1);
				out.println("var floor1 = "+floor1);
				
				out.println("var block2 = "+ block2);
				out.println("var floor2 = "+floor2);
				
				out.println("var block3 = "+ block3);
				out.println("var floor3 = "+floor3);
				
				//用来存储 判定失败的   因为上面的数据会被修改
				out.println("var block01 = "+ block1);
				out.println("var floor01 = "+floor1);
				
				out.println("var block02 = "+ block2);
				out.println("var floor02 = "+floor2);
				
				out.println("var block03 = "+ block3);
				out.println("var floor03 = "+floor3);
				
				
				out.println("var block_one = new Array(3);");
				out.println("var block_two = new Array(3);");
				out.println("var block_three = new Array(3);");
				for(int j = 0;j<3;j++){
					if(j == 0){
						for(int i = 0;i<3;i++){
							out.println("block_one["+i+"] = "+b_floors[j][i]);
						};
					}
					if(j ==1){
						for(int i = 0;i<3;i++){
							out.println("block_two["+i+"] = "+b_floors[j][i]);
							};
						}
					if(j == 2){
							for(int i = 0;i<3;i++){
								out.println("block_three["+i+"] = "+b_floors[j][i]);
								};
							}
					}
				
				
			
				out.println("</script>");
				out.println("<script type = \"text/javascript\" src = \"move_js.js\"></script>");
		out.println(" </body>");
			out.println("</html>");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	/*	try {
			response.sendRedirect("move.html");//重定向
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		

	}
	public void destroy(){

		System.out.println("进入到了 moveServlet 的destroy方法");
	}

}
