package com.cn.swj.dao;

import java.util.List;

import com.cn.swj.pojo.Admin;


public interface AdminMapper {
	
	//显示管理用用户信息
	public List<Admin> showAdmin();
	//添加管理员
	public int addAcount(Admin admin);
	
}
