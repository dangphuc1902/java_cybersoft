package com.dtp.WebNetFlix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hellocontroller {
	
	@RequestMapping(value = "/")
	public String hello(){
		return "hello";
	}

//	@RequestMapping(value = "/")
//	public Str
}
