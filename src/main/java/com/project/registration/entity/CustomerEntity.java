package com.project.registration.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMER_TABLE")
public class CustomerEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable=false)
	private Date registered;
	
	@Column(unique=true, nullable=false)
	private String email_address;
	
	@Column(nullable=false)
	private String title;
	
	@Column(nullable=false)
	private String first_name;
	
	@Column(nullable=false)
	private String last_name;
	
	@Column(nullable=false)
	private String address_line_1;
	
	private String address_line_2;
	private String city;
	
	@Column(nullable=false)
	private String postcode;
	private String phone_number;
	
	
	
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", registered=" + registered + ", email_address=" + email_address
				+ ", title=" + title + ", first_name=" + first_name + ", last_name=" + last_name + ", address_line_1="
				+ address_line_1 + ", address_line_2=" + address_line_2 + ", city=" + city + ", postcode=" + postcode
				+ ", phone_number=" + phone_number + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getRegistered() {
		return registered;
	}
	public void setRegistered(Date registered) {
		this.registered = registered;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress_line_1() {
		return address_line_1;
	}
	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}
	public String getAddress_line_2() {
		return address_line_2;
	}
	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
}
