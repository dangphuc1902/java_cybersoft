package com.crmapp.crm.controller;

import com.crmapp.crm.entity.RolesEntity;
import com.crmapp.crm.entity.UsersEntity;
import com.crmapp.crm.repository.UserRespository;
import com.crmapp.crm.service.NameParserService;
import com.crmapp.crm.service.RoleService;
import com.crmapp.crm.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private NameParserService nameParserService;

    @GetMapping("/add")
    public String userAdd(Model model){
        List<RolesEntity> listRole = roleService.getAllRole();
        model.addAttribute("listRole",listRole);
        return"user-add";
    }
    @PostMapping("/add")
    public String processAdd(   @RequestParam String fullname,
                                @RequestParam String email,
                                @RequestParam String password,
                                @RequestParam String phoneNumber,
                                @RequestParam("selectedRoleId") int roleId,
                                Model model){
        RolesEntity rolesEntity = roleService.getRoleId(roleId);
        boolean insertUser = userService.insertUser(fullname, email, password, phoneNumber, rolesEntity);
        model.addAttribute("insertUser",insertUser);
        UsersEntity usersEntity = new UsersEntity();
        model.addAttribute("fullname",fullname);
        model.addAttribute("email",email);
        model.addAttribute("password",password);
        model.addAttribute("phoneNumber",phoneNumber);
        List<RolesEntity> listRole = roleService.getAllRole();
        model.addAttribute("listRole",listRole);
        return"user-add";
    }
    @GetMapping("/delete/{user_id}")
    public String  deleteItem(@PathVariable(name = "user_id") Integer id) {
        userService.deleteUser(id);
        return "redirect:/user/table"; // Chuyển hướng người dùng về trang role-table.html sau khi xóa thành công
    }
    @GetMapping("/table")
    public String userTable(Model model){
        List<UsersEntity> listUser = userService.getAllUser();
        model.addAttribute("listUser",listUser);
        return "user-table";
    }

    @GetMapping("/update/{user_id}")
    public String update(@PathVariable(name = "user_id") int id, Model model){
        UsersEntity usersEntity = userService.getUserId(id);
        model.addAttribute("usersEntity",usersEntity);
        List<RolesEntity> listRole = roleService.getAllRole();
        model.addAttribute("listRole",listRole);
        return "user-update";
    }
    @PostMapping("/update/{user_id}")
    public String processUpdate(@PathVariable(name = "user_id") int user_id,
                                @RequestParam String fullname,
                                @RequestParam String email,
                                @RequestParam String password,
                                @RequestParam String phoneNumber,
                                @RequestParam("selectedRoleId") int roleId,
                                Model model){
        RolesEntity rolesEntity = roleService.getRoleId(roleId);
        boolean insertUser = userService.processUpdate(fullname, email, password,user_id, phoneNumber, rolesEntity);
        model.addAttribute("insertUser",insertUser);
        UsersEntity usersEntity = new UsersEntity();
        model.addAttribute("fullname",fullname);
        model.addAttribute("email",email);
        model.addAttribute("password",password);
        model.addAttribute("phoneNumber",phoneNumber);
        List<RolesEntity> listRole = roleService.getAllRole();
        model.addAttribute("listRole",listRole);
        return "redirect:/user/table";
    }

    @GetMapping("/details/{user_id}")
    public String userDetails(@PathVariable(name = "user_id") int id, Model model){
        List<UsersEntity> listUser = userService.getAllUser();
        model.addAttribute("listUser",listUser);
        return "user-details";
    }
}

