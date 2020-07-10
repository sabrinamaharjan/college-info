package com.vastika.collegeinfo.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "college_info")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String phone;
	@Column(name = "dean_name")
	private String deanName;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Temporal(TemporalType.DATE)
	private Date estd;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Course> courses;

	public College() {
	}

	public College(Long id, String name, String phone, String deanName, Date estd) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.deanName = deanName;
		this.estd = estd;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeanName() {
		return deanName;
	}

	public void setDeanName(String deanName) {
		this.deanName = deanName;
	}

	public Date getEstd() {
		return estd;
	}

	public void setEstd(Date estd) {
		this.estd = estd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "College{" + "id=" + id + ", name='" + name + '\'' + ", phone='" + phone + '\'' + ", deanName='"
				+ deanName + '\'' + ", estd=" + estd + '}';
	}

}
