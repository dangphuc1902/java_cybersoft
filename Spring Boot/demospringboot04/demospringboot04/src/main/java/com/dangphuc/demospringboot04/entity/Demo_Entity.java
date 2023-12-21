package com.dangphuc.demospringboot04.entity;

import jakarta.persistence.*;

// TODO Strategy design pattern
@Entity(name = "demo")
public class Demo_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Tự động tăng lên
    private int id;
    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
