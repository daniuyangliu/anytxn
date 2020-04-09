package com.linktree.sikehome.controller;

import com.linktree.sikehome.common.Message;
import com.linktree.sikehome.entity.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
    /*主页*/
    @RequestMapping("/main")
    public String loginMain(){
        return "systemHtml/main";
    }
    /*登录*/
    @ResponseBody
    @RequestMapping("/confirmLogin")
    public Message confirmLogin(@RequestBody UserVo userVo) {
        Message msg = null;
        try {
            msg = new Message().builder().res(true).msg("登录成功").build();
        } catch (Exception e) {
            e.printStackTrace();
            msg = new Message().builder().res(false).msg("登录异常").build();
        }
        return msg;
    }
}
