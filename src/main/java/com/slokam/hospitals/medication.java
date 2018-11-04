package com.slokam.hospitals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medication")
public class medication {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name="mid")
	private medicine medicine;
	private String hoetouse;
	private Integer quantity;
	private Integer duration;
	@ManyToOne
	@JoinColumn(name="ccid")
	private complaintss com;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(medicine medicine) {
		this.medicine = medicine;
	}
	public String getHoetouse() {
		return hoetouse;
	}
	public void setHoetouse(String hoetouse) {
		this.hoetouse = hoetouse;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public complaintss getCom() {
		return com;
	}
	public void setCom(complaintss com) {
		this.com = com;
	}
}