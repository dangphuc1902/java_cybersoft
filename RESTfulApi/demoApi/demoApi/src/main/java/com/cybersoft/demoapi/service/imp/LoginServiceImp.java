package com.cybersoft.demoapi.service.imp;

import org.springframework.stereotype.Service;

@Service
public interface LoginServiceImp {

    String checkLogin(String username, String password);

}
