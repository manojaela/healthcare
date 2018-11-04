package com.slokam.hospitals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appointmentcontroller {
	@Autowired
private appoinmentDao dao;
	@RequestMapping("saveappointment")
	public void saveappointment(@RequestBody appointments app){
		dao.save(app);
		
	}
}
