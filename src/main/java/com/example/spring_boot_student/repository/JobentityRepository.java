package com.example.spring_boot_student.repository;

import com.example.spring_boot_student.modul.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobentityRepository extends JpaRepository <JobEntity,Integer>{

}
