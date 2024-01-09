package com.crmapp.crm.service;

import com.crmapp.crm.entity.RolesEntity;
import com.crmapp.crm.entity.UsersEntity;
import com.crmapp.crm.repository.SaveEntityReponsitory;
import com.crmapp.crm.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private NameParserService nameParserService;
    @Autowired
    private UserRespository userRespository;

    public List<UsersEntity> getAllUser(){
        return userRespository.findAll();
    }
    @Autowired
    private SaveEntityReponsitory saveEntityReponsitory;
    public void insertUser(String fullname,
                           String email,
                           String password,
                           String phoneNumber,
                           String country,
                           Model model){
        boolean isSuccess = false;
        RolesEntity rolesEntity = new RolesEntity();
        UsersEntity usersEntity = new UsersEntity();
        rolesEntity.setId(3);
        usersEntity.setRolesEntity(rolesEntity);
        usersEntity.setFullname(fullname);
        String[] nameParts = nameParserService.getFirstNameAndLastName(fullname);
        usersEntity.setFirstname(nameParts[0]);
        usersEntity.setLastname(nameParts[1]);
        usersEntity.setEmail(email);
        usersEntity.setPassword(password);
        usersEntity.setPhonenumber(phoneNumber);
        usersEntity.getCountry();

        if (fullname.equals("") || email.equals("") || password.equals("") || phoneNumber.equals("")){
            isSuccess = false;
            model.addAttribute("isSuccess",isSuccess);
        }else {
            UsersEntity savedEntity = saveEntityReponsitory.saveUserEntity(usersEntity);
            if (savedEntity != null){
                isSuccess = true;
                model.addAttribute("isSuccess",isSuccess);
            }else {
                isSuccess = false;
                model.addAttribute("isSuccess",isSuccess);
            }

        }
    }
}
