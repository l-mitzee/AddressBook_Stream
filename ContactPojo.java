package com.adressbook;

public class ContactPojo {

	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String phoneNumber;
	public ContactPojo() {
		super();
	}
	public ContactPojo(int id, String firstName, String lastName, String address, String email, String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
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
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return " \n Contact id = " + id + ",\n"
				+ " FirstName = " + firstName + ",\n"
						+ " LastName = " + lastName + ",\n"
								+ " Address =" + address+ ",\n"
														+ " Email = " + email + ",\n"
																		+ " PhoneNumber = "+ phoneNumber + "]\n";
	}
	

}