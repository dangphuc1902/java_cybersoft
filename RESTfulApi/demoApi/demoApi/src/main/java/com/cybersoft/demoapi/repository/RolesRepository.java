package com.cybersoft.demoapi.repository;

import com.cybersoft.demoapi.entity.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesRepository extends JpaRepository<RolesEntity,Integer> {

}
