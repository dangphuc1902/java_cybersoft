package com.crmapp.crm.repository;

import com.crmapp.crm.Entity.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//@Repository: Đưa lên IOC(Container: để dùng chung)
@Repository
public interface RolesRepository extends JpaRepository<RolesEntity,Integer> {

}
