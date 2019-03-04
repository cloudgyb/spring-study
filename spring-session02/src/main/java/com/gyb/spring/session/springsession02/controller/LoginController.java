package com.gyb.spring.session.springsession02.controller;

import com.gyb.spring.session.springsession02.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * @author gengyuanbo
 * 2019/02/28
 */
@Controller
public class LoginController {

    @GetMapping(value = "/login")
    public String login(HttpSession session,String userName, String password){
        if("geng".equals(userName) && "123".equals(password)){
            session.setAttribute("_user",new User("1",userName,password));
            return "loginSuccess";
        }
        return "loginFailed";
    }

    @GetMapping("/loginPage")
    public String loginPage(){
        return "login";
    }

}
