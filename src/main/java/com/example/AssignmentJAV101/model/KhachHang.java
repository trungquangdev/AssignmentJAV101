package com.example.AssignmentJAV101.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "KhachHang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten",columnDefinition = "nvarchar(100)")
    private String ten;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "Email")
    private String email;

    @Column(name = "DiaChi",columnDefinition = "nvarchar(255)")
    private String diaChi;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
