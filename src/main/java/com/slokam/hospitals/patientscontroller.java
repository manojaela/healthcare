package com.slokam.hospitals;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class patientscontroller {
	@Autowired
private patientDao dao;
	@RequestMapping("savepatient")
	public void savepatient(@RequestBody patients patient){
		dao.save(patient);
	}	
	@RequestMapping("getmedicine/{medicineName}")
		public List<Object[]>getpatientsBymedicine(@PathVariable("medicineName") String medicineName){
			return dao.getpatientsBymedicine(medicineName);
		}
	

}
