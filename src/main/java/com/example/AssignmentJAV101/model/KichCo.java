package com.example.AssignmentJAV101.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="KichCo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KichCo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "TenSize")
    private String tenSize;

}
