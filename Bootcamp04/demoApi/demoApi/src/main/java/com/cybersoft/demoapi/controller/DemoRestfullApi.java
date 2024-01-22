package com.cybersoft.demoapi.controller;

import com.cybersoft.demoapi.entity.MauSac;
import com.cybersoft.demoapi.entity.SanPham;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoRestfullApi {
    @GetMapping("")
    public ResponseEntity<?>demo(){
//        ResponseEntity<?>: ? là định nghia dữ liệu chưa xác định được. trả về String hay int hay object tụ hiểu.
        List<MauSac> listMauSac = new ArrayList<>();
        MauSac mauSac = new MauSac();
        mauSac.setHinhanh("titan trắng");
        mauSac.setTenmau("trang.jpg");

        MauSac mauTuNhien = new MauSac();
        mauSac.setHinhanh("Titan tụ nhiên");
        mauSac.setTenmau("tunhien.jpg");

        listMauSac.add(mauSac);
        listMauSac.add(mauTuNhien);

        SanPham sanPham = new SanPham();
        sanPham.setTieude("Apple iPhone 15 Pro Max");
        sanPham.setDanhgia(3);
        sanPham.setMausac(listMauSac);
        sanPham.setDungluong(List.of("64GB","128GB","256GB","512GB","1TB"));
        return new ResponseEntity<>(sanPham,HttpStatus.OK);
    }
}
