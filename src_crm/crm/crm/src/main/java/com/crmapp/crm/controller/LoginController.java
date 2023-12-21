package com.crmapp.crm.controller;

import com.crmapp.crm.Entity.UsersEntity;
import com.crmapp.crm.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserRespository userRespository;
    @GetMapping("")
    public String login(){
        List<UsersEntity> list = userRespository.findByEmailAndPassword("nguyenvana@gmail.com","123456");
        for (UsersEntity item : list){
            System.out.println("Kiemtra " + item.getEmail());

        }
        return "login";
    }

    @PostMapping("")
    public String progressLogin(@RequestParam String email, @RequestParam String password){
/*
* Hoàn thiện chức năng login:
* Bước 1: Thế tham số người dùng tuyền vào hàm findByEmailANdPassword
* Bước 2: Kiếm tra xem List có dữ liệu hay không?
* Bước 3: Nếu có thì chuyển qua trang DashBoard(Tạo Link trang Dashboard/ Sử dng page index.html)
* Bước 4: Nếu thất bài thì xuất thông báo "Đăng nhập thất bại" ra màn hình login
* Lưu ý: Phương thc Post => Chỉnh form data bên giao diện login
* */

        List<UsersEntity> listUser = userRespository.findByEmailAndPassword(
                "phuctrong1902@gmail.com","123456");
        for (UsersEntity item : listUser){
            System.out.println("Kiemtra Email" + item.getEmail());
            System.out.println("Kiemtra Password" + item.getPassword());
        }
        return "login";
    }
    @RequestMapping("/dashboard")
    public String Dashboard(){

        return "index";
    }
}
