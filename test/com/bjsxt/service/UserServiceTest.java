package com.bjsxt.service;

import com.bjsxt.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Author: fs302
 * Date: 14-6-24
 * Time: обнГ1:32
 */
public class UserServiceTest {
    @org.junit.Test
    public void testAdd() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        UserService service = (UserService)ctx.getBean("userService");
        //UserDAO userDAO = (UserDAO)factory.getBean("u");
        //service.setUserDAO(userDAO);
        User u = new User();
        service.add(u);
    }
}
