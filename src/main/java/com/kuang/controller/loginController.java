package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {
    @RequestMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession httpSession) {

        if (username.equals("a") && password.equals("123")) {
            httpSession.setAttribute("lo",username);
            return "redirect:/board";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "forward:/";
        }
    }
}
