package com.dtp.WebNetFlix.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class requestParamController {
//    Tìm kiếm trả về bài dăng.
//    API: http://localhost:8080/post?category=it&id=10
//      category = it and id = 10
//    nếu chỉ có id = 10 thì hiện thị lỗi trang trắng.
//    Nếu không muốn gửi giá trị cho category cần để nó @RequestParam(required = false) thì giá trị nó = null.
//    Nếu muốn đặt giá trị mặc định defaultValue = "it"
//    name = "category"
    @RequestMapping(value = "/post")
    public String getPost(@RequestParam(required = false,defaultValue = "it") String category,
                          @RequestParam(name = "id") Integer id ){
        return "You requested " + category + " - " + id + "post";
    }
// TODO @PathVariable
    @RequestMapping(value = "/user/{type}/id/{id}")
    public String getUser(@PathVariable(name = "type") String type,
                          @PathVariable(name = "id") Integer id ){
        return "You requested " + type + " - " + id + "user";
    }
}
