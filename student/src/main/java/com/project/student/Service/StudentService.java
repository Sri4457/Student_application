package com.project.student.Service;

import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.student.Dto.MarksDto;
import com.project.student.Dto.Response;
import com.project.student.Dto.StudentDto;
import com.project.student.Feign.StudentFeign;
import com.project.student.Model.Student;
import com.project.student.Repository.StudentRepo;


@Service
public class StudentService  implements StudentServiceInter{
	
	@Autowired
	StudentRepo srepo;
	
	@Autowired
	StudentFeign sfeign;
	
	@Override
	public ResponseEntity<Response> addStudent(StudentDto studentDto) {
		try 
		{
			Student std=new Student();
			std.setName(studentDto.getName());
			std.setAddress(studentDto.getAddress());
			std.setAge(studentDto.getAge());
			std.setStudentid(studentDto.getStudentid());
			std.setMarkslist(studentDto.getMarks());
			boolean b=sfeign.addRecord(new MarksDto(studentDto.getStudentid(),studentDto.getMarks())).getBody();
			if(b)
			{
				srepo.save(std);
			}
			else {
				throw new Exception();
			}
			Response res=new Response(false,"Successfuly created student");
			return new ResponseEntity<Response>(res,HttpStatus.OK);
		}
		catch(Exception e)
		{
			Response res=new Response(true,"Something Went Wrong");
			return new ResponseEntity<Response>(res,HttpStatus.OK);
		}
	}

	@Override
	public ResponseEntity<Response> removeStudent(String studentid) {
		try {
			
			if(sfeign.deleteRecord(studentid).getBody())
			{
				srepo.deleteById(srepo.findByStudentid(studentid).getId());
				return new ResponseEntity<Response>(new Response(false,"deleted successfully"),HttpStatus.OK);
			}
			else {
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			Response res=new Response(true,"Something Went Wrong while removing student");
			return new ResponseEntity<Response>(res,HttpStatus.OK);
		}
	}

	@Override
	public StudentDto getStudentDetails(String studentId) {
		StudentDto res=studentToStudentto(srepo.findByStudentid(studentId));
		return res;
	}

	private StudentDto studentToStudentto(Student s) {
		// TODO Auto-generated method stub
		HashMap<String,Double> map=sfeign.getRecords(s.getStudentid()).getBody();
		return new StudentDto(s.getName(),s.getAddress(),s.getStudentid(),s.getAge(),s.getMarkslist(),s.getId(),map.get("max"),map.get("min"),map.get("avg"));
	}
	
	

}
