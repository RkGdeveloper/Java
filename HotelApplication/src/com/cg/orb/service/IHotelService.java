package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.HotelApplicationException;

public interface IHotelService {

	RoomRegistrationDTO registerRoom(RoomRegistrationDTO flat) throws HotelApplicationException, IOException, SQLException;
	ArrayList<Integer> getAllOwnerIds() throws HotelApplicationException, IOException, SQLException;
	boolean isHotelid_Exists(int hotel_ownid) throws HotelApplicationException, IOException, SQLException;
	boolean validateRoomType(int room_type);
	boolean validateRoomArea(int room_area);
	boolean validateRentAmount(float rent_amount);
	boolean validatePaidAmount(float paid_amount);
	boolean isPaidAmountValid(float paid_amount,float rent_amount);


	
}
