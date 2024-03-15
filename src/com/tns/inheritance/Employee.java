package com.tns.inheritance;

public class Employee extends Person{
	
	private int empid;
	private String dname;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, boolean gender, String adhaarno, int empid, String dname) {
		super(name, age, gender, adhaarno);
		this.empid = empid;
		this.dname = dname;
	}
	public Employee(int empid, String dname) {
		super();
		this.empid = empid;
		this.dname = dname;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", dname=" + dname + ", toString()=" + super.toString() + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
}
