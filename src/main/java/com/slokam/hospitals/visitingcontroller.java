package com.slokam.hospitals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visitingcontroller {
	@Autowired
private visitingDao dao;
	@RequestMapping("savevisting")
	public void savevisiting(@RequestBody visitings vist){
		dao.save(vist);
	}
}
