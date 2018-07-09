package com.naveen.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="donor")
public class Donor implements Serializable
{
	//change in central repository
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	//@NotEmpty(message="PLEASE ENTER NAME") 
	private String name;
	//@NotEmpty(message="PLEASE ENTER PASSWORD") 
	private String password;
	//@NotNull @Min(value=18,message="MIN AGE IS 18")
	private int age;
	//@NotEmpty
	private String mobile;
    //@NotBlank @Max(value=6 , message="PLEASE ENTER 6 DIGITS")
	private String pincode;
	private String change; 
	public Donor() {
		super();
	}
	public Donor(String name, String password, int age, String mobile, String pincode) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.mobile = mobile;
		this.pincode = pincode;
	}
	public Donor(int id, String name, String password, int age, String mobile, String pincode) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.mobile = mobile;
		this.pincode = pincode;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Donor [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", mobile=" + mobile
				+ ", pincode=" + pincode + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Donor other = (Donor) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		return true;
	}

	
	
}
