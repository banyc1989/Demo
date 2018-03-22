package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TPsfpOrderDao;
import com.example.demo.entity.TPsfpOrder;
import com.example.demo.service.QueryService;

@Service
public class QueryServiceImpl implements QueryService {
	@Autowired
	private TPsfpOrderDao dao;

	@Override
	public TPsfpOrder queryTPsfpOrder(String ordBillno) {
		return dao.selectByPrimaryKey(ordBillno);
	}

}
