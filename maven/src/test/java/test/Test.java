package test;


import com.likang.dao.IAccountDao;
import com.likang.model.Account;
import com.likang.service.IAccountService;
import com.likang.serviceImpl.AccountImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Test {

    @org.junit.Test
    public void run(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IAccountDao accountDao = ac.getBean(IAccountDao.class);
//        Account account =  accountDao.findById(5);
//        System.out.println(account);
        IAccountService accountService = ac.getBean(IAccountService.class);
//      错误的  AccountImpl accountService = ac.getBean(AccountImpl.class);
        Account account = accountService.findById(5);
        System.out.println(account);
    }
}
