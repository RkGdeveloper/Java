package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.RoomRegistrationDTO;

public interface IRoomRegistrationService {
	RoomRegistrationDTO registerRoom(RoomRegistrationDTO flat) throws SQLException, IOException;
	ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException;
	boolean checkValidRoomDetails(RoomRegistrationDTO rd);

}
