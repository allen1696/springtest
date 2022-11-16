package com.springbootaop.controller;

import org.springframework.stereotype.Component;

/**
 * @author zjr
 * @Create 2022-11-16  17:43
 */
@Component
public class User {
    private String name;
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
