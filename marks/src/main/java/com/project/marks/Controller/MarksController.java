package com.project.marks.Controller;

import java.util.HashMap;

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

import com.project.marks.Dto.MarksDto;
import com.project.marks.Service.MarkService;

@RestController
@RequestMapping("/marks")
@CrossOrigin
public class MarksController {

	
	@Autowired
	MarkService mservice;
	
	@PostMapping("/addrecord")
	public ResponseEntity<Boolean> addRecord(@RequestBody MarksDto mdto)
	{
		return new ResponseEntity<Boolean>(mservice.addRecord(mdto),HttpStatus.OK);
	}
	
	@GetMapping("/getmarksofstd/{stdid}")
	public ResponseEntity<HashMap<String,Double>> getRecords(@PathVariable String stdid)
	{
		return new ResponseEntity<HashMap<String,Double>>(mservice.getRecordOfStd(stdid), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleterecord/{stdid}")
	public ResponseEntity<Boolean> deleteRecord(@PathVariable String stdid)
	{
		return new ResponseEntity<Boolean>(mservice.deleteRecord(stdid),HttpStatus.OK);
	}
}
