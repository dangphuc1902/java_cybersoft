package com.dtp.WebNetFlix.controller;

import com.dtp.WebNetFlix.controllertest.dto.SpecialtyDto;
import com.dtp.WebNetFlix.controllertest.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class usercontroller {
    @RequestMapping(value = "/user")
    public UserDto getUser(){
        List<SpecialtyDto> specialties = new ArrayList<>();
        specialties.add(new SpecialtyDto("Java", "Advanced"));
        specialties.add(new SpecialtyDto("Spring Boot", "Basic"));
        return new UserDto(1,"Jin","jin@codepresso.kr",specialties);
    }
//    @RequestMapping(value = "/post")
//    public class PostController{
//        @RequestMapping(method = GET)
//        public String getPost(){
//            // Truy xuất dữ liệu trả về kq
//            return "GET /post";
//        }
//
//        @RequestMapping(method = POST)
//        public String savePost(){
//            // Xử lý dữ liệu
//            return "POST /post";
//        }
//
//        @RequestMapping(method = PUT)
//        public String updatePost(){
//            // Xử lý cập nhật.
//            return "PUT /post";
//        }
//
//        @RequestMapping(method = DELETE)
//        public String deletePost(){
//            // Xử lý xóa.
//            return "DELETE /post";
//        }
//    }
}

