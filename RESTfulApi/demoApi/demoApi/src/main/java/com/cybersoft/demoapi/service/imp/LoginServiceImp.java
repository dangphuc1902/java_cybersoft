package com.cybersoft.demoapi.service.imp;

import org.springframework.stereotype.Service;

@Service
public interface LoginServiceImp {

    boolean checkLogin(String username, String password);
}
