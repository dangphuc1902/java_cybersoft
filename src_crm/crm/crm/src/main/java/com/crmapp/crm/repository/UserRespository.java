package com.crmapp.crm.repository;

import com.crmapp.crm.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRespository extends JpaRepository<UsersEntity,Integer> {
    List<UsersEntity>findByEmailAndPassword(String email, String password);

}
