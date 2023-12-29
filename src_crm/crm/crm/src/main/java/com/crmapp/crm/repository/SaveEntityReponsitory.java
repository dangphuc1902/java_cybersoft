package com.crmapp.crm.repository;

import com.crmapp.crm.Entity.RolesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SaveEntityReponsitory {
    @Autowired
    private RolesRepository rolesRepository;
    public RolesEntity saveEntity(RolesEntity rolesEntity) {
        try {
            return rolesRepository.save(rolesEntity); // This returns the saved entity
        } catch (Exception e) {
            // Handle the exception if the save operation fails
            e.printStackTrace();
            return null; // Or perform custom error handling
        }
    }
}
