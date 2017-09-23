package com.cg.mallshop.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.mallshop.bean.Customer;
import com.cg.mallshop.dbconfig.DbUtil;

public class MallShopDaoImpl  implements IMallShopDao{

	@Override
	public ArrayList<Customer> getAllCustomersDetails() throws SQLException {
		Connection con = null;
		try {
			con = DbUtil.getConnection();
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "Select * from Employee";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<Customer> cal = new ArrayList<Customer>(); 
		Customer c = null;
		while(rs.next()){
			c = new Customer();
			c.setcId(rs.getInt(1));
			c.setcName(rs.getString(2));
			c.setcAddress(rs.getString(3));
			c.setcPhone(rs.getLong(4));
			cal.add(c);			
		}
		
		return cal;
		
	}

	@Override
	public int insertCustDetails(Customer cst) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		try {
			con = DbUtil.getConnection();
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "Insert into Employee Values(?,?,?,?)";		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, cst.getcId());
		pst.setString(2, cst.getcName());
		pst.setString(3, cst.getcAddress());
		pst.setLong(4, cst.getcPhone());
		int nr = pst.executeUpdate();
		return nr;
	}

}
