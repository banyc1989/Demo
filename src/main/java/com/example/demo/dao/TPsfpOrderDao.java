package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.TPsfpOrder;

@Mapper
public interface TPsfpOrderDao {

	TPsfpOrder selectByPrimaryKey(String ordBillno);

}