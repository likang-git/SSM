package com.likang.controller;

import com.likang.model.Account;
import com.likang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/account")
public class accountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/fandById")
    @ResponseBody
    public ModelAndView findById(){
        Account account = accountService.findById(5);
        ModelAndView mv = new ModelAndView("success");
        mv.addObject("account",account);
        return mv;
    }
}
