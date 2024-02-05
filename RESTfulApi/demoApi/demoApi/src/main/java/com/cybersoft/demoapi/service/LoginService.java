package com.cybersoft.demoapi.service;

import com.cybersoft.demoapi.entity.UsersEntity;
import com.cybersoft.demoapi.repository.UserRepository;
import com.cybersoft.demoapi.service.imp.LoginServiceImp;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Base64;

@Service
public class LoginService implements LoginServiceImp {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
//    Giúp lấy giá trị khai báo bên application.properties.
    @Value("${key.token.jwt}")
    private String strKeyToken;

    @Override
    public String checkLogin(String username, String password) {
        UsersEntity userEntity = userRepository.findByEmail(username);
        String token = "";
        if (passwordEncoder.matches(password,userEntity.getPassword())){

//            TODO: Token (Tạo Token)
//            Tạo từ key đã sinh ra và lưu trữ.
            SecretKey secretKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(strKeyToken));
            token = Jwts.builder().subject("Hello JWT").signWith(secretKey).compact();

            System.out.println("Check token: " + token);
        }
        return token;
    }
}
