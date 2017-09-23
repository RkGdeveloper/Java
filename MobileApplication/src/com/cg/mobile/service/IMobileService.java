package com.cg.mobile.service;

import com.cg.mobile.bean.PurchaseDetails;
import com.cg.mobile.exceptions.MobileApplicationException;

public interface IMobileService {

	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException;
	public boolean validateName(String name);
	public boolean validateEmail(String email);
	public boolean validatePhone(String phoneno);
	public boolean validatMobileId(String mobileId);
}
