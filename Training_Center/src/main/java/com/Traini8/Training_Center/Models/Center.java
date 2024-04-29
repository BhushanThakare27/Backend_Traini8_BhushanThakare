package com.Traini8.Training_Center.Models;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Center {
	
	@Id
	@Column(name = "CenterCode",length = 5)
	@NotBlank(message = "CenterCode cannot be blank") 
	String CenterCode ;
	
	@Column(name = "centerName")
	@NotBlank(message = "CenterName cannot be blank")
	String CenterName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressid", referencedColumnName = "id")
    private Address Address;
	
	@Column
	@Min(value = 0, message = "StudentCapacity must be greater than or equal to 0")
	double  StudentCapacity;
	
	@Column(name = "CoursesOffered")
	List<String> CoursesOffered; 
	
	@Column
	@JsonIgnore
	LocalDateTime CreatedOn;
	
	
	@Column(name = "email",length = 20)
	@Email(message = "Email should be valid")
	@NotBlank(message = "ContactPhone cannot be blank")
	String ContactEmail;
	
	@Column(name = "ContactPhone",length = 10)
	@NotBlank(message = "ContactPhone cannot be blank")
	@Pattern(regexp="[0-9]{10}", message="Phone number must be 10 digits")
	String ContactPhone;
	
	
	public Center() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Center(String centerName, String centerCode, Address address, double studentCapacity,
			List<String> coursesOffered, String contactEmail, String contactPhone) {
		super();
		CenterName = centerName;
		CenterCode = centerCode;
		this.Address = address;
		StudentCapacity = studentCapacity;
		CoursesOffered = coursesOffered;
		ContactEmail = contactEmail;
		ContactPhone = contactPhone;
	}

	public String getCenterName() {
		return CenterName;
	}

	public void setCenterName(String centerName) {
		CenterName = centerName;
	}

	public String getCenterCode() {
		return CenterCode;
	}

	public void setCenterCode(String centerCode) {
		CenterCode = centerCode;
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		this.Address = address;
	}

	public double getStudentCapacity() {
		return StudentCapacity;
	}

	public void setStudentCapacity(double studentCapacity) {
		StudentCapacity = studentCapacity;
	}

	public List<String> getCoursesOffered() {
		return CoursesOffered;
	}

	public void setCoursesOffered(List<String> coursesOffered) {
		CoursesOffered = coursesOffered;
	}

	public LocalDateTime getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		CreatedOn = createdOn;
	}

	public String getContactEmail() {
		return ContactEmail;
	}

	public void setContactEmail(String contactEmail) {
		ContactEmail = contactEmail;
	}

	public String getContactPhone() {
		return ContactPhone;
	}

	public void setContactPhone(String contactPhone) {
		ContactPhone = contactPhone;
	}
	
	
	

}
