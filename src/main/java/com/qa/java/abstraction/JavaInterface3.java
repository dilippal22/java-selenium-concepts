//Another example of interface for Bank

package com.java.abstraction;

interface Banking{
	float getRateOfInterest();
}

class HDFC implements Banking{
	public float getRateOfInterest(){
		return 7.3f;
	}
}

class HSBC implements Banking{
	public float getRateOfInterest(){
		return 7.9f;
	}
}

public class JavaInterface3 {
	public static void main(String[] args){
		Banking obj = new HDFC();
		Banking obj2 = new HSBC();
		System.out.println("HDFC Rate of Interest is: "+obj.getRateOfInterest()+"%"+"\n"+"HSBC Rate of Interest is: "+obj2.getRateOfInterest()+"%");
	}

}
