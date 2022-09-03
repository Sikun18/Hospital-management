package com.mindtree.vehicle.entity;

public class Vehicle {
	private int id;
	private String name;
	private String PhNo;
	private String address;

	public Vehicle(int id, String name, String phNo, String address) {
		super();
		this.id = id;
		this.name = name;
		PhNo = phNo;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhNo() {
		return PhNo;
	}

	public void setPhNo(String phNo) {
		PhNo = phNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
