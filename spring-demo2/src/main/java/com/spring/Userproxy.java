package com.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author zjr
 * @Create 2022-11-16  16:43
 */
@Aspect
@Component
@Order(1)
public class Userproxy {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Pointcut(value = "execution(* com.spring.User.add(..))")
    public void pointdemo(){
    }

    @Before(value = "execution(* com.spring.User.add())")
    public void before(){
        System.out.println("before....");
        String sql = "insert into user(name,age) value(?,?)";
       int i = jdbcTemplate.update(sql,"abc",12);

        System.out.println("i:"+i);



    }

}
