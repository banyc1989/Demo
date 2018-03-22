package com.example.demo.jesery.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.TPsfpOrder;
import com.example.demo.jesery.QueryInfoRest;
import com.example.demo.service.QueryService;


@Component
@Path("/com.example.demo.service.QueryService")
public class QueryInfoRestImpl implements QueryInfoRest{
	
	static{
		System.out.println("加载reset");
	}
	
	@Autowired
	private QueryService queryService;
	
	@Override
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello")
	public TPsfpOrder selectByAccountCode(  String ipsBillno) {
//	public TPsfpOrder selectByAccountCode() {
		System.out.println("查询开始>>>>");
		TPsfpOrder order = queryService.queryTPsfpOrder("BO301020170609130716391080");
		System.out.println("查询结束<<<<");
		return order;
	}

	@Override
//	@RequestMapping(value="/account/queryList",method = RequestMethod.GET)
	public List<String> selectAccounts() {
		return null;
	}

	@Override
	public TPsfpOrder selectByAccountCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
