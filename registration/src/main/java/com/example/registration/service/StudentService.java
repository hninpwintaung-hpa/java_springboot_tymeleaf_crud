package com.example.registration.service;

import java.util.List;
import java.util.Optional;

import com.example.registration.entity.Student;
import com.example.registration.model.StudentModel;

public interface StudentService {

	public List<Student> getAllStudents();
	
	public StudentModel getStudentById(Long studentId);
	
	public StudentModel saveStudent(StudentModel studentModel);
	
	public StudentModel updateStudent(StudentModel studentModel);
	
	public void deleteStudent(Long studentId);
}
