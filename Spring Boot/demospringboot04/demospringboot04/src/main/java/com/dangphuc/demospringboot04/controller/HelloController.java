package com.dangphuc.demospringboot04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// @Controller : Dùng để đánh dấu cho Spring Boot biết class này dùng để khai báo và định nghĩa đường dẫn.
// @RequestMapping: Định nghĩa đường dẫn.
@Controller
@RequestMapping("/hello")
public class HelloController {
    // Phương thức:
    //   - GET
    //   - POST
    @GetMapping("/java")
    public String helloJava(){
    // Hàm helloJava sẽ xử lý logic code cho đường dẫn /hello/java

        // Trả ra giao diện của file hello.html (được thymleaf hỗ trợ sẵn)
        return "hello";
    }
}
