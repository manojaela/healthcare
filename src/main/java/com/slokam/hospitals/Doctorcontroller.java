package com.slokam.hospitals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Doctorcontroller {
	@Autowired
private DocotorDao dao;
	@RequestMapping("saveDoctor")
	public void saveDoctor(@RequestBody Doctors doctor){
		dao.save(doctor);
	}
}
