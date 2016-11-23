package com.cn.swj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.swj.dao.AdminMapper;
import com.cn.swj.pojo.Admin;
import com.cn.swj.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{

	@Resource
	private AdminMapper adminMapper;
	@Override
	public List<Admin> showAdmin() {
		// TODO Auto-generated method stub
		return adminMapper.showAdmin();
	}

}
