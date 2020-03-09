package com.likang.service.impl;

import com.likang.dao.IAccountDao;
import com.likang.model.Account;
import com.likang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "accountService")
public class AccountServiceImpl implements IAccountService {


    @Autowired
    private IAccountDao accountDao;

    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

}
