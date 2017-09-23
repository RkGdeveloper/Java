package com.cg.mallshop.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.mallshop.bean.Customer;

public interface IMallShopDao {
	public ArrayList<Customer> getAllCustomersDetails() throws SQLException;

	public int insertCustDetails(Customer cst) throws SQLException;
}
