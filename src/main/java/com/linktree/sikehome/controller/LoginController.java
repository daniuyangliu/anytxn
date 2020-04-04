package com.linktree.sikehome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @RequestMapping("/")
    public String login(){
        return "login";
    }
    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/redis")
    public void redis1(){
        redisTemplate.opsForValue().set("username","杨柳");
    }
}