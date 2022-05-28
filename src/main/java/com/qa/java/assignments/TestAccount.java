/*Bank Operation Example*/

package com.java.assignments;

public class TestAccount {
	
	int acc_no;
	String name;
	float amount;
	
	void insert(int a, String n, float amt){
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	void depositAmount(float amt){
		amount = amount+amt;
		System.out.println("Deposit Amount: "+amt);
	}
	
	void withdrawAmount(float amt){
		if(amount<amt){
			System.out.println("Insufficient Balance");
		}else
		{
			amount = amount-amt;
			System.out.println("Withdrawn Amount is: "+amt);
		}
	}
	
	void checkBalance(){
		System.out.println("Current Balance is: "+amount);
	}
	
	void display(){
		System.out.println(acc_no+" "+name+" "+amount);
	}
	
	public static void main(String[] args){
		TestAccount a = new TestAccount();
		a.insert(0544, "Dilip", 5000);
		a.display();
		a.checkBalance();
		a.depositAmount(25000);
		a.checkBalance();
		a.withdrawAmount(50000);
		a.checkBalance();
		a.depositAmount(7000);
		a.checkBalance();
		a.withdrawAmount(25000);
		a.checkBalance();
	}

}
