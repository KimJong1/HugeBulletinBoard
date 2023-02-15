package com.kjw.HugeBulletinBoard.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class main {

    @RequestMapping(value = "/")
    public String home(){
        return "index";
    }
}
