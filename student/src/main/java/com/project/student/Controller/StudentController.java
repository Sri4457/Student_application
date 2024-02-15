package com.project.student.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.student.Dto.Response;
import com.project.student.Dto.StudentDto;
import com.project.student.Repository.StudentRepo;
import com.project.student.Service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

	@Autowired
	StudentRepo srepo;
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/addstudent")
	public ResponseEntity<Response> addStudent(@RequestBody StudentDto sdto)
	{
		return ss.addStudent(sdto);
	}
	
	@DeleteMapping("/deletestudent/{studentid}")
	public ResponseEntity<Response> deleteStudent(@PathVariable String studentid)
	{
		System.out.println("sri");
		return ss.removeStudent(studentid);
	}
	
	@GetMapping("/detailsofstudent/{studentid}")
	public ResponseEntity<StudentDto> getAllStudent(@PathVariable String studentid){
		return new ResponseEntity<StudentDto>(ss.getStudentDetails(studentid),HttpStatus.OK);
	}
}
