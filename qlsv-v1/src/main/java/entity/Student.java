package entity;

import java.sql.Date;

public class Student {
	private String maSV;
	private String name;
	private int gender;
	private Date dob;
	public Student(String maSV, String name, int gender, Date dob) {
		super();
		this.maSV = maSV;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}
	
	public Student() {
		
	}
	
	@Override
	public String toString() {
		return "Student [maSV=" + maSV + ", name=" + name + ", gender=" + gender + ", dob=" + dob + "]";
	}

	

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
}
