package com.cybersoft.demoapi.service;

import com.cybersoft.demoapi.entity.RolesEntity;
import com.cybersoft.demoapi.repository.RolesRepository;
import com.cybersoft.demoapi.service.imp.RolesServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesService implements RolesServiceImp {
    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public boolean deleteRoleById(int role_id) {
//        rolesRepository.de
        boolean isDelete = false;
//        Tránh trường hợp lỗi sẽ dừng ứng dụng.
        try {
            rolesRepository.deleteById(role_id);
            isDelete = true;
        }catch (Exception e){
//            Rơi vào isDelete = false;
            System.out.println("Loi xoa role: " + e.getMessage());
        }
        return isDelete;
    }


    @Override
    public List<RolesEntity> getAllRole() {
//        Trả ra danh sách roles cho Controller.
        return rolesRepository.findAll();
    }
}
