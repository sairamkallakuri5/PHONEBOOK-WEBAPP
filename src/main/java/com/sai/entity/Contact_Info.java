package com.sai.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTACT_DETAILS")
public class Contact_Info {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CONTACT_ID")
	private Integer contactId;
	
	@Column(name="CONTACT_NAME")
	private String name;
	
	@Column(name="CONTACT_EMAIL")
	private String email;
	
	@Column(name="CONTACT_NUMBER")
	private String Phno;

	public Contact_Info() {
		super();
	}

	public Contact_Info(Integer contactId, String name, String email, String phno) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.email = email;
		Phno = phno;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return Phno;
	}

	public void setPhno(String phno) {
		Phno = phno;
	}

	@Override
	public String toString() {
		return "Contact_Info [contactId=" + contactId + ", name=" + name + ", email=" + email + ", Phno=" + Phno + "]";
	}
	
	
	

}
