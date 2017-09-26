package com.cg.orb.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.HotelApplicationException;

public interface IRoomRegistrationDAO {

	RoomRegistrationDTO registerRoom(RoomRegistrationDTO flat) throws HotelApplicationException, IOException, SQLException ;
	ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException, HotelApplicationException ;
	int isHotelid_Exists(int hotel_ownid) throws HotelApplicationException, IOException, SQLException;
	

}
