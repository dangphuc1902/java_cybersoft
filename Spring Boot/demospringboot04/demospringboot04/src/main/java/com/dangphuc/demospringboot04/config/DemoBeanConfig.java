package com.dangphuc.demospringboot04.config;

import com.dangphuc.demospringboot04.entity.Demo_Entity;
import com.dangphuc.demospringboot04.entity.Employees_Entity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration      // Dùng để Spring Boot Chạy các code trong class màu khi spring boot chạy cấu hình ở tầngt5 config
public class DemoBeanConfig {

//    EL: Expression Language
    @Value("${demo.config.name}")
    private String name;
    @Bean()   // để tạo class gán sẵn giá trị thì sử dụng function có giá trị trả về là một class.
//    @Primary  Khi có 2 bean mà trùng tên được lưu trữ trên IOC(Container) thì sẽ lấy thằng này làm mặc định,
    public Demo_Entity createDemoEntity(){
        Demo_Entity demoEntity = new Demo_Entity();
        demoEntity.setName(name);
        demoEntity.setId(1);

        return demoEntity;
    }

    @Bean
    public Employees_Entity createEmployees(Demo_Entity demo){
        Employees_Entity employeesEntity = new Employees_Entity();
        employeesEntity.setEmployeName("Le Thi C");

        System.out.println("Kiem tra bean: " + demo.getName());
        return employeesEntity;
    }

//    @Bean(name = "demo2")    // để tạo class gán sẵn giá trị thì sử dụng function có giá trị trả về là một class.
//    public Demo_Entity createDemoEntity2(){
//        Demo_Entity demoEntity = new Demo_Entity();
//        demoEntity.setName("Nguyen Van B");
//        demoEntity.setId(2);
//
//        return demoEntity;
//    }
}
