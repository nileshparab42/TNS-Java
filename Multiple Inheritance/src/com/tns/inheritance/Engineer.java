package com.tns.inheritance;

public class Engineer extends Person {
	private String field;
	private float marks;
	
	
	
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engineer(String name, int age, boolean gender, String adhaarno, String field, float marks) {
		super(name, age, gender, adhaarno);
		this.field = field;
		this.marks = marks;
	}
	
	public Engineer(String field, float marks) {
		super();
		this.field = field;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Engineer [field=" + field + ", marks=" + marks + ", toString()=" + super.toString() + "]";
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
}
