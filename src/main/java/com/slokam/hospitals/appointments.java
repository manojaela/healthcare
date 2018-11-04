package com.slokam.hospitals;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="appointments")
public class appointments {
	@Id
	@GeneratedValue
private Long id;
private Date datetime;
private String primaryreason;
@ManyToOne
@JoinColumn(name="pid")
private patients p;
public patients getP() {
	return p;
}
public void setP(patients p) {
	this.p = p;
}
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
public String getPrimaryreason() {
	return primaryreason;
}
public void setPrimaryreason(String primaryreason) {
	this.primaryreason = primaryreason;
}
}
