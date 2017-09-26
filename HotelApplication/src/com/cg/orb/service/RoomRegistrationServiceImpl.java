package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.cg.orb.dao.IRoomRegistrationDAO;
import com.cg.orb.dao.RoomRegistrationDAOImpl;
import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.HotelApplicationException;

public class RoomRegistrationServiceImpl implements IHotelService{

	IRoomRegistrationDAO dao = new RoomRegistrationDAOImpl();

	public RoomRegistrationDTO registerRoom(RoomRegistrationDTO flat) throws  HotelApplicationException, IOException, SQLException {
		
		IRoomRegistrationDAO dao = new RoomRegistrationDAOImpl();
		return dao.registerRoom(flat);
		
	}

	
	public ArrayList<Integer> getAllOwnerIds() throws HotelApplicationException, IOException, SQLException {
		
		return dao.getAllOwnerIds();
	}


	@Override
	public boolean isHotelid_Exists(int hotel_ownid) throws HotelApplicationException, IOException, SQLException {
		RoomRegistrationDTO rd = new RoomRegistrationDTO();
		int result= dao.isHotelid_Exists(hotel_ownid);
		
		if(result == 0)
		{
			System.out.println("hotel owner  id does not exists");
			return false;
		}
			else
			{
				//System.out.println("servi chck"+rd);
				return true;
			}
	}
	
	/*public boolean isValidDetails(RoomRegistrationDTO flat)
	{
		List<String> validationErrors = new ArrayList<String>();
		boolean set = true;
		
		if(!(isHotelid_Exists(flat.getHotel_id())))
		{
			validationErrors.add("Hotel Id Should be a valid digit");
		}
		if(!(validateRoomType(flat.getRoom_type())))
		{
			validationErrors.add("Room type should be either choice 1 or choice 2");
		}
		if(!(validateRoomArea(flat.getRoom_area())))
		{
			validationErrors.add("Room Area should be a valid digit");
		}
		if(!(validateRentAmount(flat.getRent_amount())))
		{
			validationErrors.add("Rent Amount should be a valid digit");
		}
		if(!(validatePaidAmount(flat.getPaid_amount())))
		{
			validationErrors.add("Paid Amount should be a valid digit");
		}
		if(!validationErrors.isEmpty())
		{
			set = false;
		}
		return false;
	}*/


	public boolean validatePaidAmount(float paid_amount) {
		
		if((paid_amount>0 ))
		{
			return true;
		}
		else
		{	
			System.out.println("Paid Amount should be a valid digit");
			return false;
		}
	}


	public boolean validateRentAmount(float rent_amount) {
		
		
		if(rent_amount > 0)
		{
			return true;
		}
		else
		{	
			System.out.println("Rent Amount should be a valid digit");
			return false;
		}
	}


	public boolean validateRoomArea(int room_area) {
	
	
			if(room_area >0)
			{
				return true;
			}
			else
			{	
				System.out.println("Room Area should be a valid digit");
				return false;
			}
	}


	public boolean validateRoomType(int room_type) {
		
		if(room_type == 1 || room_type == 2)
		{
			
				return true;	
		}
		else
		{	
			System.out.println("Room type should be either choice 1 or choice 2");
			return false;
		}


	}
	
	public boolean isPaidAmountValid(float paid_amount,float rent_amount) {
		
		if(paid_amount > rent_amount)
		{
			return true;
		}
		else
		{
			System.out.println("Paid amount should be greater than rent amount");
			return false;
		}
	}
	
}
