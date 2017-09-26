package com.cg.recharge.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.recharge.dto.RechargeDetails;
import com.cg.recharge.service.*;

public class RechargeUI {
	static Scanner sc = new Scanner (System.in);
public static void main(String[] args) throws SQLException,IOException {
	System.out.println("REcharge Table");
	System.out.println("**************");
	while(true){
		System.out.println("1.REcharge");
		System.out.println("2.view table");
		System.out.println("3.exit");
		System.out.println("Enter choice");
		
		int choice = sc.nextInt();
		switch(choice){
		case 1:getRechargePack();
		break;
		default : System.out.println("Enter 1"); 
		}
	}
}

private static void getRechargePack() throws SQLException, IOException {
	// TODO Auto-generated method stub
	
	System.out.println("Enter recharge id");
	String recharge_id = sc.next();
	System.out.println("Enter Mobile Number");
	long mobNum = sc.nextLong();
	RechargeDetails rd = new RechargeDetails(recharge_id,mobNum);
	IRechargeService irs = new RechargeServiceImpl(); 
	int res = irs.getRechargePack(rd);
	System.out.println(res+" inserted");
}
}
