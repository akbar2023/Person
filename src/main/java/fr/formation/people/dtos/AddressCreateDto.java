package fr.formation.people.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AddressCreateDto {
	
	@NotBlank
	@Size(min = 1, max = 30)
	private String country;
	
	@NotBlank
	@Size(min = 1, max = 100)
	private String street;
	
	@NotBlank
	@Size(min = 1, max = 50)
	private String city;
	
	@NotBlank
	@Size(min = 1, max = 20)
	private String zipCode;
	
	
	public AddressCreateDto() {
		
	}
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", street=" + street + ", city=" + city + ", zipCode="
				+ zipCode + "]";
	}

}
