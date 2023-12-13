package com.dangphuc.demospringboot04.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "employees")
public class Employees_Entity {
//    Nhớ tên cột trong database mà có gạch đích thì bỏ gạch đích viết hoa ở chữ cái đầu.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "employee_name")
    private String employeName;
    private Double salary;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "department_id")
    private int departmentId;

    public int getId() {
        return employeeId;
    }

    public void setId(int id) {
        this.employeeId = id;
    }

    public String getEmployeName() {
        return employeName;
    }

    public void setEmployeName(String employeName) {
        this.employeName = employeName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}

