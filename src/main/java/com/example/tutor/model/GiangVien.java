package com.example.tutor.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class GiangVien {
    private String id;
    private String ma;
    private String ten;
    private Integer tuoi;
    private Boolean gioiTinh;
    private String diaChi;
}
