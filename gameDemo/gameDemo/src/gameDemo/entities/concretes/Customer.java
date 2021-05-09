package gameDemo.entities.concretes;

import java.time.LocalDate;

import gameDemo.entities.abstracts.Entity;

public class Customer implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private int birthday;
	private String nationalIdentity;
	
	public Customer(int id, String firstName, String lastName, int birthday, String nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		 this.lastName = lastName;
		this.birthday = birthday;
		this.nationalIdentity = nationalIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		lastName = lastName;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
}
