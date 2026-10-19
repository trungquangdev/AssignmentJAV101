package com.example.AssignmentJAV101.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "NhanVien")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name="Ma")
    private String ma;
    @Column(name = "Ten",columnDefinition = "nvarchar(100)")
    private String ten;
    @Column(name = "Email")
    private String email;
    @Column(name = "Sdt")
    private String sdt;
    @Column(name = "MatKhau")
    private String matKhau;
    @Column(name = "ChucVu",columnDefinition = "nvarchar(50)")
    private String chucVu;
    @Column(name = "TrangThai")
    private Integer trangThai;

/*@ManyToOne
* @JoinColumn(name="IdNhanVien") khóa ngoại trong bảng HoaDon
* private NhanVien nhanVien;*/

//    @OneToMany(mappedBy="nhanVien")
//    private List<HoaDon>lisHoaDon;
}
