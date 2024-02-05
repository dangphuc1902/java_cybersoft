package com.cybersoft.demoapi.service.imp;

import com.cybersoft.demoapi.entity.RolesEntity;

import javax.management.relation.Role;
import java.util.List;

public interface RolesServiceImp {
    List<RolesEntity> getAllRole();

//    boolean isRoleExit(int id);
    boolean deleteRoleById(int role_id);
}
