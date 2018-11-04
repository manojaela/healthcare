package com.slokam.hospitals;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="visitings")
public class visitings {
	@Id
	@GeneratedValue
private Long id;
private Date datetime;
@OneToOne
@JoinColumn(name="appid")
private appointments app;
@ManyToOne
@JoinColumn(name="did")
private Doctors doctors;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getDatetime() {
	return datetime;
}
public void setDatetime(Date datetime) {
	this.datetime = datetime;
}
public appointments getApp() {
	return app;
}
public void setApp(appointments app) {
	this.app = app;
}
public Doctors getDoctors() {
	return doctors;
}
public void setDoctors(Doctors doctors) {
	this.doctors = doctors;
}
}
