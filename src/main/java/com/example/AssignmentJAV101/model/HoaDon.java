
package com.example.AssignmentJAV101.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "HoaDon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "IdKhachHang")
    private Integer idKhachHang;

    @Column(name = "IdNhanVien", nullable = false)
    private Integer idNhanVien;

    @Column(name = "IdPhieuGiamGia")
    private Integer idPhieuGiamGia;

    @Column(name = "MaHoaDon", nullable = false, unique = true, length = 20)
    private String maHoaDon;

    @Column(name = "TongTien", precision = 18, scale = 2)
    private BigDecimal tongTien;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "NgayTao")
    private Date ngayTao;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
