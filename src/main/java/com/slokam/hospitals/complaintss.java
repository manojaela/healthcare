package com.slokam.hospitals;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="complaintss")
public class complaintss {
	@Id
	@GeneratedValue
private Long id;
	@ManyToMany
	@JoinTable(name="complaint_disease",
	joinColumns={@JoinColumn(name="cid")},
	inverseJoinColumns={@JoinColumn(name="decid")}
	)
private List<Diseasess> disease;
private String description;
@ManyToOne
@JoinColumn(name="vid")
private visitings visiting;

@OneToMany(mappedBy="com",cascade=CascadeType.ALL)
private List<medication>ml;
public List<medication> getMl() {
	return ml;
}
public void setMl(List<medication> ml) {
	this.ml = ml;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public List<Diseasess> getDisease() {
	return disease;
}
public void setDisease(List<Diseasess> disease) {
	this.disease = disease;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public visitings getVisiting() {
	return visiting;
}
public void setVisiting(visitings visiting) {
	this.visiting = visiting;
}
}
