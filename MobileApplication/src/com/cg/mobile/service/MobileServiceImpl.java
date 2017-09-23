package com.cg.mobile.service;

import java.util.regex.Pattern;

import com.cg.mobile.bean.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.dao.MobileDAOImpl;
import com.cg.mobile.exceptions.MobileApplicationException;

public class MobileServiceImpl implements IMobileService{

	IMobileDAO imd = null;
	
	@Override
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException {
		// TODO Auto-generated method stub
			imd = new MobileDAOImpl();
			int numOfRows = imd.addPurchaseDetailsToDAO(p);
		
		return numOfRows;
	}
	
	

	public boolean validateName(String name){
		
		String ptrn = "[A-Z]{1}[a-z]{2,19}";
		if(Pattern.matches(ptrn, name)){
			
			return true;
		}
		else
		{
			System.out.println("Please enter the Correct Name");
			return false;
		}
	}
	
	public boolean validateEmail(String email){
		
		String ptrn = "^[?=.*A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]{2,6}$";
		if(Pattern.matches(ptrn, email)){
			
			return true;
		}
		else
		{
			System.out.println("Please enter the Correct Email");
			return false;
		}
	}


	public boolean validatePhone(String phoneno){
	
	String ptrn = "[0-9]{10}";
	if(Pattern.matches(ptrn, phoneno)){
		
		return true;
	}
	else
		{
		System.out.println("Please enter the Correct Phoneno");
		return false;
		}
	}
	
	
	public boolean validatMobileId(String mobileId){
		return false;
		
	}
		

}
