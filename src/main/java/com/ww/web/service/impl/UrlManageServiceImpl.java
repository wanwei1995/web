package com.ww.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ww.web.dao.UrlManageMapper;
import com.ww.web.model.UrlManage;
import com.ww.web.service.UrlManageService;

@Service
public class UrlManageServiceImpl implements UrlManageService{
	
	@Autowired
	private UrlManageMapper urlManageMapper;

	@Override
	public UrlManage selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return urlManageMapper.selectByPrimaryKey(id);
	}
	
	

}
