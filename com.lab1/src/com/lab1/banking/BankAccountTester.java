package com.lab1.banking;

public class BankAccountTester {
public static void main(String[] args) {
	BankAccount account1 = new BankAccount("Karki",200.00);
	
	account1.depositFund(22.3);
	System.out.println(account1);
	
	account1.depositFund(22.3,10);
	System.out.println(account1);
	
	account1.withdrawFund(69.06);
	System.out.println(account1);

	account1.withdrawFund(100.0,50.0);
	System.out.println(account1);
	
	System.out.println("==============");
	
	BankAccount account2 = new BankAccount("Shakar");

	System.out.println(account2);
	
	account2.depositFund(500);
	System.out.println(account2);
	
	account2.depositFund(22.3,10);
	System.out.println(account2);
	
	account2.withdrawFund(69.06);
	System.out.println(account2);

	account2.withdrawFund(100.0,50.0);
	System.out.println(account2);
	

}
}
