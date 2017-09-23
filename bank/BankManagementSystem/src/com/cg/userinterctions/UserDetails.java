package com.cg.userinterctions;

import com.cg.acct.Account;

public class UserDetails {

public static void main(String[] args) {
		
	Account sm = new Account();
	Account kt = new Account();
	
	// a) Create Account for smith with initial balance as INR 2000 and for Kathy with initial balance as 3000.
	sm.setName("Smith");
	sm.setAge(22);
	sm.setAccNum(); // accNum should be auto generated
	sm.setBalance(2000);
	
	sm.printPerson(sm);
	
	kt.setName("Kathy");
	kt.setAge(21);
	kt.setAccNum(); // accNum should be auto generated
	kt.setBalance(3000);
	
	kt.printPerson(kt);
	
	// b) Deposit 2000 INR to smith account.
	sm.deposite(2000);
	sm.printPerson(sm);
	
	// c) Withdraw 2000 INR from Kathy account.
	
	kt.withdraw(2000);
	kt.printPerson(kt);
	
	
	}
}
