/*Program of static variable*/

package com.java.objectclass;

public class StaticVariable {
	
	int rollno;
	String name;
	static String college = "ADCET";
	
	StaticVariable(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
	}
	
	public void display(){
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args){
		StaticVariable s = new StaticVariable(32, "Dilip");
		StaticVariable v = new StaticVariable(35, "Ramesh");
		s.display();
		v.display();
	}

}
