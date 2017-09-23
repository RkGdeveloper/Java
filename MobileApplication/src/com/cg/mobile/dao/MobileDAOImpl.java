package com.cg.mobile.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import com.cg.mobile.bean.PurchaseDetails;
import com.cg.mobile.databaseconfig.DbUtil;
import com.cg.mobile.exceptions.MobileApplicationException;

public class MobileDAOImpl implements IMobileDAO{
	int numRows;
	@Override
	public int addPurchaseDetailsToDAO(PurchaseDetails p) throws MobileApplicationException {
		// TODO Auto-generated method stub
		
		try {
			Connection con =  DbUtil.getConnection();
			
			String insertQ = "INSERT INTO PurchaseDetails Values(purchase_seq_id.nextval,?,?,?,SYSDATE,?)";
			PreparedStatement ps = con.prepareStatement(insertQ);
			ps.setString(1, p.getCname());
			ps.setString(2, p.getMailId());
			ps.setLong(3,p.getPhoneNo());
			ps.setInt(4, p.getMobileId());
			
			/*String mobiledata = "SELECT mobileid from mobiles Where mobileid = ?";
			PreparedStatement pst = con.prepareStatement(mobiledata);
			int mob_id;
			pst.setInt(1,p.getMobileId());
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				System.out.println("Mobile Id is "+(mob_id = rs.getInt(1)));
				ps.setInt(4, mob_id);
			}*/
			
			numRows = ps.executeUpdate();
			
			
			
		}
		catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			throw new MobileApplicationException(e.getMessage());
		}
		
		
		
		return numRows;
	}

	
	
}
