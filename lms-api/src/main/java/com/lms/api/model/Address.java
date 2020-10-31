package com.lms.api.model;

import lombok.Data;

@Data
public class Address {
	
	
	public Address(String houseNumber, String street, String town, String landMark, String district, String state,
			String country, String pincode) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.town = town;
		this.landMark = landMark;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	private String houseNumber;
	private String street;
	private String town;
	private String landMark;
	private String district;
	private String state;
	private String country;
	private String pincode;


}
