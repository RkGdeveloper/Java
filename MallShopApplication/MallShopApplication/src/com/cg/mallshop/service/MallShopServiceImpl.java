package com.cg.mallshop.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.mallshop.bean.Customer;
import com.cg.mallshop.dao.IMallShopDao;
import com.cg.mallshop.dao.MallShopDaoImpl;

public class MallShopServiceImpl implements IMallShopService{

	@Override
	public ArrayList<Customer> getAllDetails() throws SQLException {
		IMallShopDao imd = new MallShopDaoImpl();
		ArrayList<Customer> al = imd.getAllCustomersDetails();
		return al;
	}

	@Override
	public int insertCustomer(Customer cst) throws SQLException {
		// TODO Auto-generated method stub
		IMallShopDao imd = new MallShopDaoImpl();
		int nr = imd.insertCustDetails(cst);
		
		return nr;
	}

}
