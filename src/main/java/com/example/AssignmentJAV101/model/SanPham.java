package com.example.AssignmentJAV101.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;

import java.lang.annotation.Native;

@Entity
@Table(name = "SanPham")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "TenSanPham")
    @Nationalized
    private String tenSanPham;

    @Column(name = "MoTa")
    @Nationalized
    private String moTa;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
