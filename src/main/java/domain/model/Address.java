package domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
	@JsonProperty
	private String name;
	@JsonProperty
	private String town;
	@JsonProperty
	private String province;
	@JsonProperty
	private String country;
	@JsonProperty
	private String postalcode;
	@JsonProperty
	private String street;
	@JsonProperty
	private String number;
	
	public Address() {
		
	}
	
	public Address(String name, String town, String province, String country, String postalcode, String street, String number) {
		setName(name);
		setTown(town);
		setProvince(province);
		setCountry(country);
		setPostalcode(postalcode);
		setStreet(street);
		setNumber(number);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
}
