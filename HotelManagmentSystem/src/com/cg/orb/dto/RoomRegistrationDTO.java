package com.cg.orb.dto;

public class RoomRegistrationDTO {

	private int roomNo;
	private int hotelId;
	private int roomType;
	private int roomArea;
	private double rentAmt;
	private double paidAmt;
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getRoomType() {
		return roomType;
	}
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	public int getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(int roomArea) {
		this.roomArea = roomArea;
	}
	public double getRentAmt() {
		return rentAmt;
	}
	public void setRentAmt(double rentAmt) {
		this.rentAmt = rentAmt;
	}
	public double getPaidAmt() {
		return paidAmt;
	}
	public void setPaidAmt(double paidAmt) {
		this.paidAmt = paidAmt;
	}
	public RoomRegistrationDTO(int hotelId, int roomType,
			int roomArea, double rentAmt, double paidAmt) {
		super();
		this.hotelId = hotelId;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.rentAmt = rentAmt;
		this.paidAmt = paidAmt;
	}
	public RoomRegistrationDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
}
