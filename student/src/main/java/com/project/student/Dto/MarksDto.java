package com.project.student.Dto;

import lombok.Data;

import java.util.List;

@Data
public class MarksDto {

	private String stdid;
	private List<Double> marks;
	private long id;
	

	public MarksDto(String stdid, List<Double> marks) {
		super();
		this.stdid = stdid;
		this.marks = marks;
	}
	
	public MarksDto() {
		
	}
}
