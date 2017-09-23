package com.cg.mallshop.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.mallshop.bean.Customer;

public interface IMallShopService {

	public ArrayList<Customer> getAllDetails() throws SQLException;

	public int insertCustomer(Customer cst) throws SQLException;
	
}
