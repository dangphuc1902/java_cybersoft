package com.cybersoft.demoapi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SercurityConfig {
/*
    Spring Security 6~
* Thay doi thong tin cau hinh cua Security: Phan quyen, chung thuc,...
* */
//    Khởi tạo chuẩn mã hoá sử dụng và lưu trên IOC
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    // Tạo danh sách user luu tạm trên RAM.
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){
        UserDetails admin = User.withUsername("admin").password(passwordEncoder().encode("123")).roles("ADMIN").build();
        UserDetails user = User.withUsername("user").password(passwordEncoder().encode("123456")).roles("USER").build();
        return new InMemoryUserDetailsManager(admin,user);
    }
    @Bean
    public SecurityFilterChain securityFilterChain4(HttpSecurity httpSecurity) throws Exception{
        return httpSecurity.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers(HttpMethod.GET,"/admin").permitAll()
                .requestMatchers(HttpMethod.POST,"/admin").hasRole("USER")
                .requestMatchers(HttpMethod.POST,"/login/**").permitAll()
                .requestMatchers(HttpMethod.PUT,"/admin").hasRole("ADMIN")
                .requestMatchers(HttpMethod.DELETE,"/admin").hasAnyRole("ADMIN","USER")
                .anyRequest().authenticated()                   // con cac link con lai phai chung thuc
                .and()
                .httpBasic()
                .and()
                .build();

    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        Cách cũ.
        return http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/role").permitAll()          // permitAll: cho phep ai di vao cung dc.
                .requestMatchers("/role/**").hasRole("ADMIN")
                .anyRequest().authenticated()                   // con cac link con lai phai chung thuc
                .and()
                .httpBasic()
                .and()
                .build();
//       Cách Mới:
//        http.csrf(c -> c.disable())
//                .authorizeHttpRequests(a ->{
//                        a.requestMatchers("/role","/role/**").permitAll();         // Cho phép chạy
//                        a.anyRequest().authenticated();                 // Yeu cau chung thuc.
//                }
//                );
//        return http.build();

    }
}
