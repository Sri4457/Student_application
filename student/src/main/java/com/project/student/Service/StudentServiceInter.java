package com.project.student.Service;

import org.springframework.http.ResponseEntity;

import com.project.student.Dto.Response;
import com.project.student.Dto.StudentDto;

public interface StudentServiceInter {

	public ResponseEntity<Response> addStudent(StudentDto studentDto);
	
	public ResponseEntity<Response> removeStudent(String studentid);
	
	public StudentDto getStudentDetails(String studentId);
}
