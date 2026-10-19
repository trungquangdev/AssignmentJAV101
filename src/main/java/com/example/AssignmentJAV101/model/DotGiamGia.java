
package com.example.AssignmentJAV101.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "DotGiamGia") // Phải đúng tên bảng trong SQL Server
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

    @Column(name = "Ma", nullable = false, unique = true, length = 20)
    private String ma;

    @Column(name = "TenDot", nullable = false, length = 100,columnDefinition = "nvarchar(100)")
    private String tenDot;

    @Column(name = "PhanTramGiam", nullable = false)
    private Integer phanTramGiam;

    // SQL Server dùng DATETIME nên ánh xạ bằng Date và @Temporal.
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "NgayBatDau", nullable = false)
    private Date ngayBatDau;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "NgayKetThuc", nullable = false)
    private Date ngayKetThuc;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
