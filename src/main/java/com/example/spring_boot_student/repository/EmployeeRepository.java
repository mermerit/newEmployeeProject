package com.example.spring_boot_student.repository;

import com.example.spring_boot_student.modul.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query(value = "SELECT * FROM employee s where s.email =?1",nativeQuery = true)
    public Employee getEmployeeByEmailAddress(
            @Param("email") String email);

    @Query(value = "SELECT * FROM employee s where s.name =?1",nativeQuery = true)
    public Employee getEmployeeByName(
            @Param("name") String name);


}
