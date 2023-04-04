package com.estore.estoreapplication.entities;

public class Seller {
	int id;
	int mobno;
	String name;
	String password;
	String city;
	String state;
	String country;
	String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Seller(int id, int mobno, String name, String password, String city, String state, String country,
			String address) {
		super();
		this.id = id;
		this.mobno = mobno;
		this.name = name;
		this.password = password;
		this.city = city;
		this.state = state;
		this.country = country;
		this.address = address;
	}
	
}
