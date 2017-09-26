package com.cg.recharge.service;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.recharge.dto.RechargeDetails;

public interface IRechargeService {
public int getRechargePack(RechargeDetails r) throws SQLException, IOException;
}
