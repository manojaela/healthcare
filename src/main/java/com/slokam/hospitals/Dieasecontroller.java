package com.slokam.hospitals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dieasecontroller {
	@Autowired
private DiseaseDao dao;
	@RequestMapping("savediseases")
	public void savediseases(@RequestBody Diseasess disease){
		dao.save(disease);
	}
}
