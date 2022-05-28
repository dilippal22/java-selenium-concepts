/*Program of changing the common property of all
 * objects(static field).*/

package com.java.objectclass;

public class StaticMethod {
	
	int rollno;
	String name;
	static String college = "ADCET";
	
	public static void changeCollege(){
		college = "Xavier";
	}
	
	StaticMethod(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
	}
	
	public void display(){
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public static void main(String[] args){
		StaticMethod d = new StaticMethod(32, "Dilip");
		StaticMethod r = new StaticMethod(35, "Ramesh");
		StaticMethod v = new StaticMethod(35, "Vinit");
		StaticMethod.changeCollege();
		d.display();
		r.display();
		v.display();
	}

}
