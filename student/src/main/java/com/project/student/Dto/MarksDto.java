package com.project.student.Dto;

import java.util.List;

public class MarksDto {

	private String stdid;
	private List<Double> marks;
	private long id;
	
	public String getStdid() {
		return stdid;
	}
	public void setStdid(String stdid) {
		this.stdid = stdid;
	}
	public List<Double> getMarks() {
		return marks;
	}
	public void setMarks(List<Double> marks) {
		this.marks = marks;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public MarksDto(String stdid, List<Double> marks) {
		super();
		this.stdid = stdid;
		this.marks = marks;
	}
	
	public MarksDto() {
		
	}
}
