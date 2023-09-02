package com.example.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.Student;
import com.example.registration.model.StudentModel;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
