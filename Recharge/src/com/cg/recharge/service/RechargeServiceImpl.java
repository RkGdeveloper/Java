package com.cg.recharge.service;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.recharge.dao.*;
import com.cg.recharge.dto.RechargeDetails;

public class RechargeServiceImpl implements IRechargeService {

	IRechargeDao dao = new RechargeDaoImpl();
	@Override
	public int getRechargePack(RechargeDetails r) throws SQLException, IOException {
		return dao.getRechargePack(r);
	}

}
