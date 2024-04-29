package com.Traini8.Training_Center.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Address {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	private int Id;
	
	@Column(name="DetailedAddress")
	String  DetailedAddress;
	
	@Column(name="City")
	String City;
	
	@Column(name="State")
	String State;
	
	@Column(name="Pincode")
	Double Pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String detailedAddress, String city, String state, Double pincode) {
		super();
		DetailedAddress = detailedAddress;
		City = city;
		State = state;
		Pincode = pincode;
	}
	String getDetailedAddress() {
		return DetailedAddress;
	}
	public void setDetailedAddress(String detailedAddress) {
		DetailedAddress = detailedAddress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Double getPincode() {
		return Pincode;
	}
	public void setPincode(Double pincode) {
		Pincode = pincode;
	}
	
	
  
}
