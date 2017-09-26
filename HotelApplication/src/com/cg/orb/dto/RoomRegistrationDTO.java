package com.cg.orb.dto;

public class RoomRegistrationDTO {

	@Override
	public String toString() {
		return " " + roomno + " ";
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	private int hotel_id;
	private int room_type;
	private int room_area;
	private float rent_amount;
	private float paid_amount;
	private int roomno;
	
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public int getRoom_type() {
		return room_type;
	}
	public void setRoom_type(int room_type) {
		this.room_type = room_type;
	}
	public int getRoom_area() {
		return room_area;
	}
	public void setRoom_area(int room_area) {
		this.room_area = room_area;
	}
	public float getRent_amount() {
		return rent_amount;
	}
	public void setRent_amount(float rent_amount) {
		this.rent_amount = rent_amount;
	}
	public float getPaid_amount() {
		return paid_amount;
	}
	public void setPaid_amount(float paid_amount) {
		this.paid_amount = paid_amount;
	}
	public RoomRegistrationDTO(int hotel_id, int room_type, int room_area,
			float rent_amount, float paid_amount) {
		super();
		this.hotel_id = hotel_id;
		this.room_type = room_type;
		this.room_area = room_area;
		this.rent_amount = rent_amount;
		this.paid_amount = paid_amount;
	}

	public RoomRegistrationDTO()
	{
		
	}
	
}
