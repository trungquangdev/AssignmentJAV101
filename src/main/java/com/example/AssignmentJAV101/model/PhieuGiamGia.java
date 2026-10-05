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
public class PhieuGiamGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "TenPhieu")
    private String tenPhieu;

    @Column(name = "GiaTriGiam")
    private Float giaTriGiam;

    @Column(name = "GiamToiDa")
    private Float giamToiDa;

    @Column(name = "DonToiThieu")
    private Float donToiThieu;

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "NgayKetThuc")
    private String ngayKetThuc;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
