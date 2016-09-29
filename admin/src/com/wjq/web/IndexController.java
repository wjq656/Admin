package com.wjq.web;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjq.bean.Content;
import com.wjq.bean.WjqParams;
import com.wjq.core.BaseController02;
import com.wjq.service.content.IContentService;
import com.wjq.service.user.IUserService;


@Controller
@RequestMapping("/admin")
public class IndexController extends BaseController02{
	@Autowired
	IContentService contentService;
	@Autowired
	IUserService userService;
	
	
	@RequestMapping("index")
	public String index(WjqParams params){
		int pageSize = params.getPageSize();
		int pageNum = params.getPageNum();
		//�ܵ�������Ŀ
		double allNum; 
		//�ܵķ�Ϊ��ҳ
		int allPages;
		//����һҳ���߽�0�Ǳ��ֵ�һҳ
		if(pageNum<1)
			params.setPageNum(1);
		//һ�������ܵ�ҳ����Ϊ���һҳ
		
		List<Content> contents=null;
		if(params.getKeyword()!=null&&params.getKeyword().length()>0){
			//�ܵ�������Ŀ
			allNum = contentService.searchAccount(params); 
			//�ܵķ�Ϊ��ҳ
			allPages = (int) Math.ceil(allNum/pageSize);
			if(allPages<pageNum)
				params.setPageNum(allPages);
			params.setPageAll(params.getPageSize()*(params.getPageNum()-1));
			contents = contentService.searchContents(params);
		}
		else {
			//�ܵ�������Ŀ
			allNum = contentService.ContentsAccount(params); 
			//�ܵķ�Ϊ��ҳ
			allPages = (int) Math.ceil(allNum/pageSize);
			if(allPages<pageNum)
				params.setPageNum(allPages);
			params.setPageAll(params.getPageSize()*(params.getPageNum()-1));
			System.out.println("contentaccountִ�����");
			contents = contentService.findContents(params);
			System.out.println("findcountִ�����");
		}  
		request.setAttribute("contents",contents);
		request.setAttribute("params",params);
		request.setAttribute("allPages",allPages);
		return "success";
	}
	
}
