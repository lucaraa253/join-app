package com.training.spring;

public class Address {
	private int addressId;
	private String city;
	private String state;
	private int zipCode;
	
	public Address(int addressId, String city, String state, int zipCode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		System.out.println("Paramatarized constr called");
	}
	
	public Address() {
		
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
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
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	
	
}
