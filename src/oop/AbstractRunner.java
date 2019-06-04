package oop;

public class AbstractRunner {
	
	public static void main(String[] args) {
		BankAbstract one = new BankNIC();
	
		System.out.println(one.accountBalance());	

}
}
