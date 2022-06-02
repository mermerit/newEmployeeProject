package com.example.spring_boot_student.service;

import com.example.spring_boot_student.modul.Employee;
import com.example.spring_boot_student.modul.JobEntity;
import com.example.spring_boot_student.repository.EmployeeRepository;
import com.example.spring_boot_student.repository.JobentityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
@org.springframework.stereotype.Service

@AllArgsConstructor
public class EmployeeService implements Service {
    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }
    @Override
    public Employee findById(int theid) {
        Optional<Employee> result=repository.findById(theid);
        Employee theEmployee =null;
        if (result.isPresent()){
            theEmployee=result.get();
        }
        else {
            throw new RuntimeException("Did not find student id "+theid);
        }
        return theEmployee;
    }
    @Override
    public void save(Employee theEmployee) {
repository.save(theEmployee);
    }
    @Override
    public void deleted(int theid) {
        repository.deleteById(theid);
    }
}
