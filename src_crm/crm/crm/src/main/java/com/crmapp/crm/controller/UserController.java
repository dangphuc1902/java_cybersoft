package com.crmapp.crm.controller;

import com.crmapp.crm.entity.RolesEntity;
import com.crmapp.crm.entity.UsersEntity;
import com.crmapp.crm.service.RoleService;
import com.crmapp.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/add")
    public String userAdd(Model model){

        return"user-add";
    }
    @PostMapping("/add")
    public String processAdd(   @RequestParam String fullname,
                                @RequestParam String email,
                                @RequestParam String password,
                                @RequestParam String phoneNumber,
                                @RequestParam String country,
                                Model model){
        userService.insertUser(fullname, email, password, phoneNumber, country, model);
        return"user-add";
    }

    @GetMapping("/table")
    public String userTable(Model model){
        List<UsersEntity> listUser = userService.getAllUser();
        model.addAttribute("listUser",listUser);
        return "user-table";
    }
}

