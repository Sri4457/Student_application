package com.project.student.Feign;

import java.util.HashMap;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.student.Dto.MarksDto;

@FeignClient("MARKS-SERVICE")
public interface StudentFeign {
	
	@PostMapping("/marks/addrecord")
	public ResponseEntity<Boolean> addRecord(@RequestBody MarksDto mdto);
	
	@GetMapping("/marks/getmarksofstd/{stdid}")
	public ResponseEntity<HashMap<String,Double>> getRecords(@PathVariable String stdid);
	
	@DeleteMapping("/deleterecord/{stdid}")
	public ResponseEntity<Boolean> deleteRecord(@PathVariable String stdid);

}
