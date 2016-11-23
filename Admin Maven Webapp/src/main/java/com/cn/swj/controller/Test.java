package com.cn.swj.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.cn.swj.pojo.Admin;
import com.cn.swj.service.AdminService;

@Controller
@RequestMapping("/test")
public class Test {
	
	@Resource
	private AdminService adminService;
	
	@RequestMapping("/index")
	public String test(){
		List<Admin> admins = adminService.showAdmin();
		System.out.println(JSON.toJSONString(admins));
		return "index";
	} 
}

