package com.dangphuc.demospringboot04.repository;

import com.dangphuc.demospringboot04.entity.Employees_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// <Tên Entity, kiểu dữ liệu khóa chính>
@Repository
public interface EmployeeRepository extends JpaRepository<Employees_Entity,Integer> {
    List<Employees_Entity>findByEmployeNameAndAndSalary(String name,double salary);
//     Câu query truy vấn thông tin bảng bằng Tên Nhân viện.

}
