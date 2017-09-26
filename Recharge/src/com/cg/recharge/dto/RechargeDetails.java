package com.cg.recharge.dto;

public class RechargeDetails {
	private String recharge_id;
	private long mobNum;
	
	
	public long getMobNum() {
		return mobNum;
	}
	public void setMobNum(long mobNum) {
		this.mobNum = mobNum;
	}
	
	
	public RechargeDetails(String recharge_id, long mobNum) {
		super();
		this.recharge_id = recharge_id;
		this.mobNum = mobNum;
	}
	public String getRecharge_id() {
		return recharge_id;
	}
	public void setRecharge_id(String recharge_id) {
		this.recharge_id = recharge_id;
	}
	public RechargeDetails(){
		
	}
}
