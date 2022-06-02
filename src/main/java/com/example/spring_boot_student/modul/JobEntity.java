package com.example.spring_boot_student.modul;

import liquibase.pro.packaged.E;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class JobEntity {
    @Id

    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "job_id")
    private int id;private String name;

}
