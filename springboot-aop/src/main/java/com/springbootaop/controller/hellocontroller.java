package com.springbootaop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjr
 * @Create 2022-11-16  17:41
 */
@RestController
public class hellocontroller {

    @RequestMapping("/")
    public String hello(){
        System.out.println("request.........");
        return "aaa";
    }
}
