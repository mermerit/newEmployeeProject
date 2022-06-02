package com.example.spring_boot_student.service;

import com.example.spring_boot_student.exception.ResourseNotFoundException;
import com.example.spring_boot_student.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {
     @Mock
    private EmployeeRepository repository;
     private EmployeeService underTest;
     @BeforeEach
    void setUp(){

        underTest=new EmployeeService(repository);
    }
    @Test
    void findAll() {
        //when
        underTest.findAll();
        //then
        verify(repository).findAll();
    }

    @Test
    void save() {
    }@Test
    void deleted() {

    }
}