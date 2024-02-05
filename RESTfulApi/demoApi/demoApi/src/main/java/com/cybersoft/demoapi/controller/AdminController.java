package com.cybersoft.demoapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("")
    private ResponseEntity<?> getAdminRole(){
        return new ResponseEntity<>("Hello Get", HttpStatus.OK);
    }
    @PostMapping("")
    private ResponseEntity<?> postAdminRole(){
        return new ResponseEntity<>("Hello Post",HttpStatus.OK);
    }
    @PutMapping("")
    private ResponseEntity<?> putAdminRole(){
        return new ResponseEntity<>("Hello Put",HttpStatus.OK);
    }
    @DeleteMapping("")
    private ResponseEntity<?> deleteAdminRole(){
        return new ResponseEntity<>("Hello Delete",HttpStatus.OK);
    }
}
