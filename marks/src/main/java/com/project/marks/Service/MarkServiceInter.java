package com.project.marks.Service;

import java.util.HashMap;

import com.project.marks.Dto.MarksDto;

public interface MarkServiceInter {

	public boolean addRecord(MarksDto mdto);
	
	public HashMap<String,Double> getRecordOfStd(String stdid);
	
	public boolean deleteRecord(String stdid);
}
