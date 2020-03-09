package com.likang.dao;

import com.likang.model.Account;

import org.springframework.stereotype.Repository;

@Repository
public interface IAccountDao {

    Account findById(Integer id);
}
