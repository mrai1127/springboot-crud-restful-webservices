package com.practice;

public class Address {

	String street;
	int houseNo;
	String city;
	String state;
	int zipCode;

	public Address() {
	}

	public Address(String street, int houseNo, String city, String state, int zipCode) {
		super();
		this.street = street;
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNo=" + houseNo + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}

}
