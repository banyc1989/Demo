package com.example.demo.jesery;

import java.util.List;

import com.example.demo.entity.TPsfpOrder;

public interface QueryInfoRest {
    // 通过账户 id(主键)查找账户
	TPsfpOrder selectByAccountCode(String accountCode);
	TPsfpOrder selectByAccountCode();

    // 查找所有账户
    List<String> selectAccounts();

}
