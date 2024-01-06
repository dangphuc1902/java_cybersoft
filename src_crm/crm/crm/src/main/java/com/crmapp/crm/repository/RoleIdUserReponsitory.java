package com.crmapp.crm.repository;

import com.crmapp.crm.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleIdUser extends JpaRepository<UsersEntity, Integer> {
//    @Query("SELECT u.roleId FROM UsersEntity u WHERE u.email = :email AND u.password = :password")
    Integer findRoleIdByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
