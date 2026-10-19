
package com.example.AssignmentJAV101.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PhieuGiamGia")
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

    @Column(name = "Ma", nullable = false, unique = true, length = 20)
    private String ma;

    @Column(name = "TenPhieu", nullable = false, length = 100)
    @Nationalized
    private String tenPhieu;

    // DECIMAL trong SQL Server nên dùng BigDecimal, không dùng Float.
    @Column(name = "GiaTriGiam", nullable = false, precision = 18, scale = 2)
    private BigDecimal giaTriGiam;

    @Column(name = "GiamToiDa", precision = 18, scale = 2)
    private BigDecimal giamToiDa;

    @Column(name = "DonToiThieu", precision = 18, scale = 2)
    private BigDecimal donToiThieu;

    @Column(name = "SoLuong", nullable = false)
    private Integer soLuong;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "NgayKetThuc", nullable = false)
    private Date ngayKetThuc;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
