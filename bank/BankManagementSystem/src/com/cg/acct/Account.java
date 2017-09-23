package com.cg.acct;

import com.cg.person.Person;

public class Account extends Person{

	private static long accNum = 12457878;
	private double balance;
	private Person accHolder;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum() {
		Account.accNum = accNum+1;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposite(double amt)
	{
		balance = balance +amt;
		setBalance(balance);
	}
	public void withdraw(double amt)
	{
		balance = balance - amt;
		setBalance(balance);
	}
	
	public void printPerson(Account ac)
	{
		System.out.println("----------------------------------------------\nAccount Number : "+ac.getAccNum());
		System.out.println("Account Name : "+ac.getName());
		System.out.println("Account Balance : "+ac.getBalance());	
	}
	
	
}
