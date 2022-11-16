package com.spring;

import org.springframework.context.annotation.Scope;

/**
 * @author zjr
 * @Create 2022-11-16  13:39
 */
@Scope("prototype")
public class User {
 User(){
     System.out.println("test");
 }


}
