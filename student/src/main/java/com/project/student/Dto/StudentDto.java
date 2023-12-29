package com.project.student.Dto;

import java.util.List;

public class StudentDto {

	private String name,address,studentid;
	private int age;
	private List<Double> marks;
	private long id;
	private double max,min,avg;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public List<Double> getMarks() {
		return marks;
	}
	public void setMarks(List<Double> marks) {
		this.marks = marks;
	}
	
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public StudentDto(String name, String address, String studentid, int age, List<Double> marks, long id, double max,
			double min, double avg) {
		super();
		this.name = name;
		this.address = address;
		this.studentid = studentid;
		this.age = age;
		this.marks = marks;
		this.id = id;
		this.max = max;
		this.min = min;
		this.avg = avg;
	}
	public StudentDto() {
		
	}
	
}
