package com.lab1.banking;

public class BankAccount {
	
	private int accNumber;
	private String name;
	private double balance;
	private static int nextAccNum = 1;
	
	
	
	
//contructor with both name and balance given by user
	public BankAccount(String name, double balance) {
		
		this.name = name;
		this.balance = balance;
		this.accNumber = this.nextAccNum;
		this.nextAccNum = this.nextAccNum+1;
	}
//constructor with only name but no balance given
public BankAccount(String name) {
		
		this.name = name;
		this.balance = 0.0;
		this.accNumber = this.nextAccNum;
		this.nextAccNum = this.nextAccNum+1;
	}


//withdraw method with amount	
	public void withdrawFund(double amount) {
		balance  = balance - amount;
		
	}
	
//withdraw with amount and fee	
	public void withdrawFund(double amount, double fee) {
		balance  = balance - amount - fee;
	
	}

//deposit with amount
	public void depositFund(double amount) {
		balance = balance + amount;
	}
	
//deposit with amount and interest	
public void depositFund(double amount, double interest) {
		balance = ((balance + amount)+(interest/100)*(balance + amount));
		
	}

//print account number and balance
public String toString() {
	return "Account Number of "+name+ " :" +this.accNumber+"    Balance: "+ this.balance; 
}
}
