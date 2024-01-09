package com.crmapp.crm.service;

import com.crmapp.crm.entity.RolesEntity;
import com.crmapp.crm.repository.RolesRepository;
import com.crmapp.crm.repository.SaveEntityReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//Lưu ý: Tên service sẽ giống tên controller. Bởi vì Service là nơi xử lý logic code cho controller,
@Service
public class RoleService {
    @Autowired
    private RolesRepository rolesRepository;
    public List<RolesEntity> getAllRole(){
        return rolesRepository.findAll();
    }
    @Autowired
    private SaveEntityReponsitory saveEntityService;
public void insertRole(String roleName, String desc,Model model){
    boolean isSuccess = false;
    RolesEntity rolesEntity = new RolesEntity();
    rolesEntity.setName(roleName);
    rolesEntity.setDescription(desc);


    if (roleName.equals("") || desc == "") {
        isSuccess = false;
        model.addAttribute("isSuccess",isSuccess);

    }else {
        RolesEntity savedEntity = saveEntityService.saveEntity(rolesEntity);
        if (savedEntity != null){
            isSuccess = true;
            model.addAttribute("isSuccess",isSuccess);
        }
        else {
            isSuccess = false;
            model.addAttribute("isSuccess",isSuccess);
        }
        /*
         * - Chỉnh link/ role thành /role/add : fix lỗi liên quan css và js bên file HTML.   xong
         * - Nếu thêm thành role thành công thì phải xuất ra màn hiình thông báo "thêm thành công" ngược lại "Thêm thất bại".
         * */
    }
}
}
