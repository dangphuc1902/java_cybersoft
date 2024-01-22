package com.cybersoft.demoapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {
    private String tieude;
    private double danhgia;
    private List<MauSac> mausac;
    private List<String> dungluong;
}
