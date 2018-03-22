package com.example.demo.resource.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TPsfpOrder;
import com.example.demo.resource.QueryInfo;
import com.example.demo.service.QueryService;



@RestController
public class QueryInfoImpl implements QueryInfo{
	
	@Autowired
	private QueryService queryService;
	
	@Override
	@RequestMapping(value="/account/query",method = RequestMethod.GET)
//	@RequestMapping(value="/account/query",method = RequestMethod.GET)
	public TPsfpOrder selectByAccountCode( @RequestParam(name="ipsBillno") String ipsBillno) {
		System.out.println("查询开始>>>>");
		TPsfpOrder order = queryService.queryTPsfpOrder(ipsBillno);
		System.out.println("查询结束<<<<");
		return order;
	}

	@Override
	@RequestMapping(value="/account/queryList",method = RequestMethod.GET)
	public List<String> selectAccounts() {
		return null;
	}

}
