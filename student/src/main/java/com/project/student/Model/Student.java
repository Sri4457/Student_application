package com.project.student.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="studentid", nullable=false, unique=true)
	private String studentid;
	
	@Column(name="age",nullable=false)
	private int age;
	
	@Column(name="markslist", nullable=false)
	@ElementCollection
	private List<Double> markslist;
	
	@Column(name="address", nullable=false)
	private String address;

	public Student(String name, String studentid, int age, List<Double> markslist, String address) {
		super();
		this.name = name;
		this.studentid = studentid;
		this.age = age;
		this.markslist = markslist;
		this.address = address;
	}

	public Student() {
		
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Double> getMarkslist() {
		return markslist;
	}

	public void setMarkslist(List<Double> markslist) {
		this.markslist = markslist;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
