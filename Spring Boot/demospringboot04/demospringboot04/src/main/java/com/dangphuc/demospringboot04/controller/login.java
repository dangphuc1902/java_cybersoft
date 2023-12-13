package com.dangphuc.demospringboot04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/java")
public class login {
    @GetMapping("/login")
    public String login(@RequestParam String input){
        System.out.println("kiem tra tham so: " + input );
        return "hello";
    }
    @PostMapping("/welcomeuser")
    public String welcome(@RequestParam(required = false) String username){
        {
            System.out.println("Ten nguoi dung: " + username);
            return "welcome";
        }
    }
}
