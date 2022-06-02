package com.example.spring_boot_student.service;

import com.example.spring_boot_student.modul.Employee;
import com.example.spring_boot_student.modul.JobEntity;

import java.util.List;

public interface Service {
    public List<Employee> findAll();
    public Employee findById (int theid);
    public void save(Employee theEmployee );
    public void deleted(int theid);
}

