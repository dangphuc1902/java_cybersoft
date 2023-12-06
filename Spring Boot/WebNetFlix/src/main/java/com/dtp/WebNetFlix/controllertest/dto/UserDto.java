package com.dtp.WebNetFlix.controllertest.dto;

import java.util.List;

public class UserDto {
    int id;
    String name;
    String email;
    List<SpecialtyDto> specialties;

    public UserDto(int id, String name, String email, List<SpecialtyDto> specialties) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.specialties = specialties;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<SpecialtyDto> getSpecialties() {
        return specialties;
    }
}

