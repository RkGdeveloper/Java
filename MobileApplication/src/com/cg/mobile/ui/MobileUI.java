package com.cg.mobile.ui;

import java.util.Scanner;

import com.cg.mobile.bean.PurchaseDetails;
import com.cg.mobile.exceptions.MobileApplicationException;
import com.cg.mobile.service.IMobileService;
import com.cg.mobile.service.MobileServiceImpl;

public class MobileUI {
	Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args) throws MobileApplicationException {
	
		MobileUI mu = new MobileUI();
		mu.userChoice();	
	}
	
	void userChoice() throws MobileApplicationException{
		System.out.println("Mobile Application\n===============================\n");
		
		while(true){
			System.out.println(" 1.Enter Purchase Details : \n 2.Get All Mobile Details\n 3.Exit \n Enter Your Choice\n");
			int ch = sc.nextInt();
				switch(ch)
				{
				
				case 1:
					
						addPurchaseDetails();
				
				break;
				case 2:
					getAllMobileDetails();
				break;
				
				case 3:
					System.exit(0);
				}
			
		}
	}

	private void getAllMobileDetails() {
		
		
	}

	private void addPurchaseDetails() throws MobileApplicationException {
		IMobileService ims = new MobileServiceImpl();
		System.out.println("Enter Customer Name : ");
		String cName =sc.next();
		if(ims.validateName(cName)){
			System.out.println("Enter Email Id : ");
			String eMail = sc.next();
			if(ims.validateEmail(eMail)){
						System.out.println("Enter Phone Number : ");
						long phone = sc.nextLong();
						String num = String.valueOf(phone);
						if(ims.validatePhone(num)){
							System.out.println("Enter Mobile Id");
							int mobid = sc.nextInt();
							PurchaseDetails pd = new PurchaseDetails(cName,eMail,phone,mobid);
							
							int noOfRows=0;
							try {
								noOfRows = ims.addPurchaseDetails(pd);
							} catch (MobileApplicationException e) {
								// TODO Auto-generated catch block
								System.out.println("Exception Occured In getAllMobileDetails : "+e.getMessage());
								e.printStackTrace();
							}
							System.out.println(noOfRows+" inserted");
								}
					}
				}
		
	}

}
