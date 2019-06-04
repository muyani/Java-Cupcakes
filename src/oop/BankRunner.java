package oop;

public class BankRunner {
	
	/*
	 * Polymorphism is the ability of an object to take different forms
	 * i.e can be instances of both super and sub class
	 * 
	 * When a method is defined in both super and sub classes then the
	 * method in the subclass will override the one in the superclass.
	 */

	public static void main(String[] args) {
		
		Bank one = new BankNIC();
		
		System.out.println(one.interestRate());
		
		Bank two = new BankEquity();
		
		System.out.print(two.interestRate());

	}

}
