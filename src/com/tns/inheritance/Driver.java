package com.tns.inheritance;

public class Driver {

	public static void main(String[] args) {
		com.tns.inheritance.Employee emp1= new Employee("Nilesh", 22, false, "5768 2002 8967", 21, "IT");
		System.out.println(emp1);
		
		Engineer eng1= new Engineer("Askaan", 22, true, "5744 2101 9867", "Computer", 80.10f);
		System.out.println(eng1);;
	}

}
