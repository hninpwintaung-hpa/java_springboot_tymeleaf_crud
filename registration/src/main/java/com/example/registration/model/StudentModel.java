package com.example.registration.model;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.example.registration.entity.Student;

public class StudentModel {
	 private Long studentId;
	    
		@NotNull(message = "Student name is required")
	    private String studentName;
	     
		@NotNull(message = "Gender is required")
	    private String gender;
		
		@NotNull(message = "DOB is required")
	    private String dob;
		
		@NotNull(message = "Email is required")
		@Email(message = "Email should be valid format")
	    private String email;
		
		@NotNull(message = "Address is required")
	    private String address;
		
		@NotNull(message = "Major is required")
	    private String major;
		
		@NotNull(message = "Age is required")
	    private String age;
		
		private List<Student> studentList;

		public Long getStudentId() {
			return studentId;
		}

		public void setStudentId(Long studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getMajor() {
			return major;
		}

		public void setMajor(String major) {
			this.major = major;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public List<Student> getStudentList() {
			return studentList;
		}

		public void setStudentList(List<Student> studentList) {
			this.studentList = studentList;
		}
}
