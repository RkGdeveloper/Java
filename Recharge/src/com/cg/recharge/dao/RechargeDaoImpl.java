package com.cg.recharge.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.recharge.dbutil.DbUtil;
import com.cg.recharge.dto.RechargeDetails;

public class RechargeDaoImpl implements IRechargeDao{
	PreparedStatement ps;
	Connection con ;
	@Override
	public  int getRechargePack(RechargeDetails r) throws SQLException, IOException {
		con=DbUtil.getConnection();
		String str = "insert into RechargeDetails values(sr_id_seq.nextval,?,"
				+ "(select r.packname from recharge r where recharge_id like ?),"
				+ "(select r.amount from recharge r where recharge_id like ?),?)";
		ps=con.prepareStatement(str);
		ps.setString(1,r.getRecharge_id());
		ps.setString(2,r.getRecharge_id());
		ps.setString(3,r.getRecharge_id());
		ps.setLong(4,r.getMobNum());
		int rows = ps.executeUpdate();
		return rows;
		
	}

}
