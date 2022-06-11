/*Calling constructor within constructor. It maintains the chain
 * between the constructor i.e it is used for constructor
 * chaining. NOTE: Call to this() keyword should always be first
 * in constructor.
 * Example: Real use of this constructor call*/

package com.java.objectclass;

public class ThisConstructorCall {
	int rollno;
	String name, course;
	float fee;
	
	ThisConstructorCall(int rollno, String name, String course){
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
	ThisConstructorCall(int rollno, String name, String course, float fee){
		this(rollno, name, course);
		this.fee = fee;
	}
	
	public void display(){
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
	public static void main(String[] args){
		ThisConstructorCall obj = new ThisConstructorCall(1, "Dilip", "BE");
		ThisConstructorCall obj2 = new ThisConstructorCall(2, "Ramesh", "BCOM", 200);
		obj.display();
		obj2.display();
	}

}
