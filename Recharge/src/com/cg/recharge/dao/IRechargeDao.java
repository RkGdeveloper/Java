package com.cg.recharge.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.recharge.dto.RechargeDetails;

public interface IRechargeDao {
	public int getRechargePack(RechargeDetails r) throws SQLException, IOException;
}
