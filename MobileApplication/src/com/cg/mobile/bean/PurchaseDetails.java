package com.cg.mobile.bean;

import java.time.LocalDate;

public class PurchaseDetails {

	private long purchaseId;
	private String cName;
	private String mailId;
	private long phoneNo;
	private LocalDate date;
	private int mobileId;
	
	public PurchaseDetails(){}
	
	public PurchaseDetails(String cName, String mailId,
			long phoneNo, int mobileId) {
		super();
		this.cName = cName;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
		this.mobileId = mobileId;
	}

	public long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getCname() {
		return cName;
	}

	public void setCname(String cName) {
		this.cName = cName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	
	
	
}
