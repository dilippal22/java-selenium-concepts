/*This is employee class. another example of aggregation*/

package com.java.aggregation;

public class Employee {
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display(){
		System.out.println("ID is: "+id+" "+"and"+" "+"Name is: "+name);
		System.out.println("Address is: "+address.city+","+" "+address.state+","+" "+address.country);
	}
	
	public static void main(String[] args){
		Address a1 = new Address("Mumbai", "Maharashtra", "India");
		Address a2 = new Address("New York City", "New York", "USA");
		
		Employee e1 = new Employee(375, "Dilip", a1);
		Employee e2 = new Employee(528, "Kavita", a2);
		
		e1.display();
		e2.display();
	}

}
