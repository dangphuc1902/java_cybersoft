package com.crmapp.crm.controller;

import com.crmapp.crm.Entity.RolesEntity;
import com.crmapp.crm.repository.RolesRepository;
import com.crmapp.crm.repository.SaveEntityReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/role")
public class RoleController {
/*
* b1: xác định nghiệp vụ cho chức năng
* b2: Xác định câu truy vấn
* b3: Xác định số lượng tham số sẽ sử dụng cho controller (đường dẫn đã khai báo)
* -- Xử l nghiệp vụ thông qua code
* b4:  để thực hiện được các câu truy vấn liên quan tới bảng đã được xác địnhở bước 2 => phải tạo ra
* file repository để quản lý các câu truy vấn nếu chưa có.
* b5: Xác định hàm tương ứng với lại câu truy vấn bước 2 của JPA
*
* */

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private SaveEntityReponsitory saveEntityService;
    /*
* save(): có 2 chức năng vừa là thêm mới dữ liệu, vừa là cập nhật dữ liệu.
*   - Thêm mới: khóa chính class entity truyền vào hàm save() không có  giá trị
*   - Cập nhật: khóa chính của class entity truyền vào hàm save() có giá trị.
* */

    @GetMapping("/add")
    public String add(Model model){
        //TODO note:  Thêm dữ liệu vào bảng role và không gán giá trị cho kháo chính Id
//        rolesEntity.setId(4);       // Update
//        rolesEntity.setName("ROLE_TEST");
//        rolesEntity.setDescription("Hello Test");
//        rolesRepository.save(rolesEntity);      //save nhận vào Entity.
        return "role-add.html";
    }
    @PostMapping("/add")
    public String processAdd(   @RequestParam String roleName,
                             @RequestParam String desc,
                             Model model){

        boolean isSuccess = false;
        RolesEntity rolesEntity = new RolesEntity();
        rolesEntity.setName(roleName);
        rolesEntity.setDescription(desc);


        if (roleName == "" || desc == "") {
            isSuccess = false;
            model.addAttribute("isSuccess",isSuccess);
            return "role-add.html";
        }else {
            RolesEntity savedEntity = saveEntityService.saveEntity(rolesEntity);
            if (savedEntity != null){
                isSuccess = true;
                model.addAttribute("isSuccess",isSuccess);
                return "role-add.html";
            }
            else {
                isSuccess = false;
                model.addAttribute("isSuccess",isSuccess);
                return "role-add.html";
            }
        }



/*
* - Chỉnh link/ role thành /role/add : fix lỗi liên quan css và js bên file HTML.   xong
* - Nếu thêm thành role thành công thì phải xuất ra màn hiình thông báo "thêm thành công" ngược lại "Thêm thất bại".
* */
    }
}
