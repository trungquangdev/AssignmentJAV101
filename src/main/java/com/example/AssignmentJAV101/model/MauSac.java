package com.example.AssignmentJAV101.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="MauSac")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MauSac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "TenMau",columnDefinition = "nvarchar(100)")
    private String tenMau;
}
