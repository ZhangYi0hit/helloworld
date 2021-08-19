package com.kuang.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class indexController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }

}
