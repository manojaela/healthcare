package com.slokam.hospitals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class medicinecontroller {
	@Autowired
private medicineDao dao;
	@RequestMapping("savemedicine")
	public void savemedicine(@RequestBody medicine medicine){
		dao.save(medicine);
	}
}
