package com.example.demo.resource;

import java.util.List;

import com.example.demo.entity.TPsfpOrder;

public interface QueryInfo {
    // 通过账户 id(主键)查找账户
	TPsfpOrder selectByAccountCode(String accountCode);

    // 查找所有账户

    List<String> selectAccounts();

}
