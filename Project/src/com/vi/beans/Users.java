package com.vi.beans;

public class Users {
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String department;
	private String year;
	private String dob;
	private String gender;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String firstname, String lastname, String username, String password, String department, String year,
			String dob, String gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.department = department;
		this.year = year;
		this.dob = dob;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Users [firstname=" + firstname + ", lastname=" + lastname + ", username=" + username + ", password="
				+ password + ", department=" + department + ", year=" + year + ", dob=" + dob + ", gender=" + gender
				+ "]";
	}
	
	
	
}
