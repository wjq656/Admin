package com.wjq.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;


@Component
public class BaseController02 {
	
	//��Ϊ�� protected �������������ã������private ˽�� �򲻿���
	//��һ��
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	
	/*//�ڶ���
		protected HttpServletResponse response;
		protected HttpServletRequest request;
		protected HttpSession session;
		
		@ModelAttribute  
		public void setReqAndRes(HttpServletRequest request, HttpServletResponse response,HttpSession session){  
		    this.response= response;  
		    this.request = request;
		    this.session = session;
		}*/
	
}
