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
public class ChiTietSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "IdSanPham")
    private Integer idSanPham;

    @Column(name = "IdMauSac")
    private Integer idMauSac;

    @Column(name = "IdKichCo")
    private Integer idKichCo;

    @Column(name = "GiaBan")
    private Float giaBan;

    @Column(name = "SoLuongTon")
    private Integer soLuongTon;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
