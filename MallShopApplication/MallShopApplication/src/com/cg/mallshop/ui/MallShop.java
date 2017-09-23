package com.cg.mallshop.ui;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.mallshop.bean.Customer;
import com.cg.mallshop.service.IMallShopService;
import com.cg.mallshop.service.MallShopServiceImpl;


public class MallShop {

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		IMallShopService iss = new MallShopServiceImpl();
		ArrayList<Customer> cs = iss.getAllDetails();
		
		for(Customer c : cs){
			System.out.println(c);
		}
		
		

		
		Customer cst  = new Customer();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cust Id");
		int cid = sc.nextInt();
		cst.setcId(cid);
		System.out.println("Enter Name ");
		String cname = sc.next();
		cst.setcName(cname);
		System.out.println("Enter Address");
		String add = sc.next();
		cst.setcAddress(add);
		System.out.println("Enter phone");
		long phone = sc.nextLong();
		cst.setcPhone(phone);
		int nr = iss.insertCustomer(cst); 
			
		if(nr > 0)
			System.out.println(nr+" row inserted");
		else
			System.out.println("Not Inserted");
		
		
		
	}
	
}
