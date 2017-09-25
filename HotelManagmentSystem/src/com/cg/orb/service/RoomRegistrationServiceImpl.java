package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.frs.dao.IRoomRegistrationDAO;
import com.cg.frs.dao.RoomRegistrationDAOImpl;
import com.cg.orb.dto.RoomRegistrationDTO;

public class RoomRegistrationServiceImpl implements IRoomRegistrationService{

	IRoomRegistrationDAO ird = new RoomRegistrationDAOImpl();
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	@Override
	public RoomRegistrationDTO registerRoom(RoomRegistrationDTO flat) throws SQLException, IOException {
		return ird.registerRoom(flat);
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException {
		
		al = ird.getAllOwnerIds();
		return al;
	}

	@Override
	public boolean checkValidRoomDetails(RoomRegistrationDTO rd) {
		
		if(!al.contains(rd.getHotelId()))
		{
			System.out.println("Hotel Id does not exist");
		return false;
		}
		else
			return true;
	}

	
	
}
