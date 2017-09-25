package com.cg.frs.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.RoomRegistrationDTO;

public interface IRoomRegistrationDAO {
	RoomRegistrationDTO registerRoom(RoomRegistrationDTO flat) throws SQLException, IOException;
	ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException;

}
