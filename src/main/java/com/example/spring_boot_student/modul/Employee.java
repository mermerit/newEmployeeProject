package com.example.spring_boot_student.modul;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@ToString
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    @Column(name = "name")
    private String name;
    @Column(unique = true)
    private String email;
    @OneToOne( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private JobEntity jobEntity;
public Employee(String name ,String email)
{
    name=name;
    email=email;
}
}

