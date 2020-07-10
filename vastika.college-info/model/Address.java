package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address_info")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String street;
	private String city;
	@Column(name = "postal_code")
	private int postalCode;
	private String country;
	private String state;

	@ManyToOne
	private College college;

	public Address() {
	}

	public Address(Long id, String street, String city, int postalCode, String country, String state) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Address{" + "id=" + id + ", street='" + street + '\'' + ", city='" + city + '\'' + ", postalCode="
				+ postalCode + ", country='" + country + '\'' + ", state='" + state + '\'' + '}';
	}
}
