package com.cybersoft.demoapi.controller;

import com.cybersoft.demoapi.payload.resoponse.BaseResponse;
import com.cybersoft.demoapi.service.LoginService;
import com.cybersoft.demoapi.service.imp.LoginServiceImp;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Encoders;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;
import java.security.Key;

@RestController
@RequestMapping("/login")
public class LoginController {
/*
* Do Password lưu trữ trong database là chuỗi mã hoá dạng BCrypt cho  nên không dùng password như điều kiện Where
*
* Bước 1: Viết câu truy vấn lấy dữ liệu đăng nhập dựa  trên username.
* Bước 2: Lấy dữ liệu password trả ra từ bước 1 và kiểm tra xem password lưu trữ trong database với password người dùng truyền lên.
* Bước 3: Nếu 2 mật khẩu match thì sẽ tạo ra token, nếu không giống thì đăng nhập thất bại.
*       - Tạo ra Key để mã hoá và giải mã.
* */
    @Autowired
    private LoginServiceImp loginServiceImp;

    @PostMapping("")
    public ResponseEntity<?>login(@RequestParam String username, @RequestParam String password){
//        TODO: Private key: Tạo ra key để mã hoá và sau đó lưu vo application.properties.
//        SecretKey secretKey = Jwts.SIG.HS256.key().build();
//        String key = Encoders.BASE64.encode(secretKey.getEncoded());
//        System.out.println("Check key :"  + key);
        String token = loginServiceImp.checkLogin(username,password);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(token);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
}
