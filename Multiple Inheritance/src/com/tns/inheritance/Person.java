package com.tns.inheritance;

public class Person {
	
	private String name;
	private int age;
	private boolean gender;
	private String adhaarno;
	
	
	
	public Person() {
		super();
	}
	
	
	
	public Person(String name, int age, boolean gender, String adhaarno) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.adhaarno = adhaarno;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", adhaarno=" + adhaarno + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAdhaarno() {
		return adhaarno;
	}
	public void setAdhaarno(String adhaarno) {
		this.adhaarno = adhaarno;
	}
	
	
	
}
