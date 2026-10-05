package com.example.AssignmentJAV101.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="ChiTietSanPham")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DotGiamGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "TenDot")
    private String tenDot;

    @Column(name = "PhanTramGiam")
    private Integer phanTramGiam;

    @Column(name = "NgayBatDau")
    private String ngayBatDau;

    @Column(name = "NgayKetThuc")
    private String ngayKetThuc;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
