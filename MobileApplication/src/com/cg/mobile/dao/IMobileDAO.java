package com.cg.mobile.dao;

import com.cg.mobile.bean.PurchaseDetails;
import com.cg.mobile.exceptions.MobileApplicationException;

public interface IMobileDAO {

	public int addPurchaseDetailsToDAO(PurchaseDetails p) throws MobileApplicationException;
	
}
