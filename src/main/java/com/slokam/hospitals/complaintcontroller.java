package com.slokam.hospitals;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class complaintcontroller {
	@Autowired
private complaintDao dao;
	
	@RequestMapping("savecomplaint")
	public void savecomplint(@RequestBody complaintss comp){
		List<medication>medicationlist=comp.getMl();
		for (medication medication : medicationlist) {
			medication.setCom(comp);
		}
		dao.save(comp);
	}
}
