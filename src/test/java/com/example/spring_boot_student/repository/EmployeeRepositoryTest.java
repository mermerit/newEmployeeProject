package com.example.spring_boot_student.repository;

import com.example.spring_boot_student.modul.Employee;
import com.example.spring_boot_student.modul.JobEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.not;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository repository;
    @Test
    public void saveStudent(){
        JobEntity jobEntity = JobEntity.builder()
                .name("java")
                .build();
        Employee employee= Employee.builder()
                .email("mermer@gmail")
                .name("mermer")
                .jobEntity(jobEntity)
                .build();
    repository.save(employee);
    }
    @Test
   public void getEmployee()
   {
    List <Employee>employees=
    repository.findAll();
       System.out.println(employees);
   }
   @Test
   public void getEmployeById()
    {
        Integer id=1;
        boolean isExist=repository.findById(id).isPresent();

        repository.findById(id);
        System.out.println(isExist);
        boolean isnotExist=repository.findById(id).isPresent();
        if (isExist==true)
        {
            assertTrue(isExist);
        }
        else {
            System.out.println("not found");
            assertFalse(isnotExist);
        }


    }

   @Test
   public void updateEmployee()
   {
   }
   @Test
   public void Delete()
   {
    Integer id =10;
    boolean isExist=repository.findById(id).isPresent();
    repository.deleteById(id);
       boolean isnotExist=repository.findById(id).isPresent();
       assertTrue(isExist);
       assertFalse(isnotExist);
   }
    @Test
    public void printEmployeeByEmailAddressNativeNamedId(){
        String email="kakamer";
        Employee employee=repository.getEmployeeByEmailAddress(email);
        System.out.println("Employee "+employee);
        assertThat (employee.getEmail()).isEqualTo(email);

    }
    @Test
    public void printEmployeeByName(){
        String name="mermer";
        Employee employee=repository.getEmployeeByName(name);
        System.out.println("employee name = " +employee );
        assertThat(employee.getName()).isEqualTo(name);
    }



}