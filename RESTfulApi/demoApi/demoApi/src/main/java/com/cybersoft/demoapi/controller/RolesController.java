package com.cybersoft.demoapi.controller;

import com.cybersoft.demoapi.entity.RolesEntity;
import com.cybersoft.demoapi.payload.resoponse.BaseResponse;
import com.cybersoft.demoapi.repository.RolesRepository;
import com.cybersoft.demoapi.service.imp.RolesServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.Role;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RolesController {
    @Autowired
    private RolesServiceImp rolesServiceImp;
//    Autowired về Interface nó.  để đỡ tốn hơn về dung lươợng.
    @GetMapping("")
    public ResponseEntity<?> getRole(){
        List<RolesEntity> listRole = rolesServiceImp.getAllRole();
        return new ResponseEntity<>(listRole, HttpStatus.OK);
    }
//    Định nghĩa đường dẫn trước.

//    TODO API Delete: Viết API xoá role với tham số nhận vào là role_id
/*
*   {
*   "statusCode" : 200,
*   "message": "",
*   "data": â
* }
* */



//    @DeleteMapping("/{role_id}")
//    private ResponseEntity<?> deleteRole(@PathVariable("role_id") int id){
//        boolean isSeccess = rolesServiceImp.deleteRoleById(id);
//        BaseResponse baseResponse = new BaseResponse();
//        baseResponse.setMessage(isSeccess ? "Thanh cong" : "That bai");
//        baseResponse.setData(isSeccess);
//        return new ResponseEntity<>(baseResponse,HttpStatus.OK);
//    }

    /*      Cấu hình Security như bên dưới.
     * Tạo link GET /admin -> ai truy cập cũng được.
     *          POST /admin -> Chỉ user truy cập được.
     *          UPDATE / admin -> CHỉ admin vô được.
     *          DELETE / admin -> admin hoặc user vô được.
     * */




}
