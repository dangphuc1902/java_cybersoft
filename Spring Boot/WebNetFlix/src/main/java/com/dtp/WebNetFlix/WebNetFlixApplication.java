package com.dtp.WebNetFlix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
// Loại trừ đăng nhập của securityautoconfiguration.
public class WebNetFlixApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebNetFlixApplication.class, args);
	}

}
