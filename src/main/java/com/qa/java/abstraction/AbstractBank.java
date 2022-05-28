/*Another example of abstraction*/

package com.java.abstraction;

abstract class Bank{
	abstract int getRateOfInterest();
}

class SBI extends Bank{
	int getRateOfInterest(){
		return 7;
	}
}

class PNB extends Bank{
	int getRateOfInterest(){
		return 9;
	}
}

public class AbstractBank {
	public static void main(String[] args){
		Bank b = new SBI();
		Bank b2 = new PNB();
		System.out.println("SBI Rate of Interest is: "+b.getRateOfInterest()+"%");
		System.out.println("PNB Rate of Interest is: "+b2.getRateOfInterest()+"%");
	}

}
