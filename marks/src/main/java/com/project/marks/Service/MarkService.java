package com.project.marks.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.marks.Dto.MarksDto;
import com.project.marks.Model.Marks;
import com.project.marks.Repository.MarksRepository;

@Service
public class MarkService implements MarkServiceInter {

	@Autowired
	MarksRepository mrepo;
	
	
	@Override
	public boolean addRecord(MarksDto mdto) {
		try {
		Marks m=new Marks();
		m.setMaxmarks(Collections.max(mdto.getMarks()));
		m.setMinmarks(Collections.min(mdto.getMarks()));
		m.setStdid(mdto.getStdid());
		m.setAvgmarks(mdto.getMarks().stream().collect(Collectors.averagingDouble(Double::doubleValue)));
		mrepo.save(m);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	@Override
	public HashMap<String, Double> getRecordOfStd(String stdid) {
		Marks m=mrepo.findByStdid(stdid);
		HashMap<String,Double> map=new HashMap<>();
		map.put("max", m.getMaxmarks());
		map.put("min", m.getMinmarks());
		map.put("avg", m.getAvgmarks());
		return map;
	}


	@Override
	public boolean deleteRecord(String stdid) {
		try {
			mrepo.deleteById(mrepo.findByStdid(stdid).getId());
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
