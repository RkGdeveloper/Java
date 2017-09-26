package com.cg.orb.ui;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.HotelApplicationException;
import com.cg.orb.service.IHotelService;
import com.cg.orb.service.RoomRegistrationServiceImpl;

public class Client {

	static Scanner sc = new Scanner(System.in);		
	static RoomRegistrationDTO details = null;		
	static IHotelService service= new RoomRegistrationServiceImpl();
	
	public static void main(String[] args) throws IOException, SQLException, HotelApplicationException {
		
		System.out.println("Hotel Application");
		System.out.println("_______________________");
		while(true)
		{
			System.out.println("1.Booking Room");
			System.out.println("2.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 : registerRoom();
						break;
			case 2 : System.exit(0);
			}
		}
	}
	
	private static void registerRoom() throws HotelApplicationException, IOException
	{
		PropertyConfigurator.configure("log4j.properties");
		Logger logger = Logger.getRootLogger();
		
		ArrayList <Integer> list =null;
		try {
			list = service.getAllOwnerIds();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println("array error");
		}
		try {
			System.out.println("Existing HotelOwner IDS Are:-"+list);
			
			System.out.println("Please enter your hotel owner id from above list:");
			int hotel_ownid = sc.nextInt();
			
			if(service.isHotelid_Exists(hotel_ownid))
			{
			System.out.println("Select  room type Type (1-1AC, 2-2NON-AC):");
			int room_type = sc.nextInt();
			
			if(service.validateRoomType(room_type))
			{
			System.out.println("Enter room area in sq. ft.: ");
			int room_area = sc.nextInt();
			
			if(service.validateRoomArea(room_area))
			{
			System.out.println("Enter desired rent amount Rs: ");
			float rent_amount = sc.nextFloat();
			
			if(service.validateRentAmount(rent_amount))
			{
			System.out.println("Enter desired paid amount Rs: ");
			float paid_amount = sc.nextFloat();
			
			if(service.validatePaidAmount(paid_amount))
			{
				if(service.isPaidAmountValid(paid_amount, rent_amount))
				{
			details = new RoomRegistrationDTO(hotel_ownid,room_type,room_area,rent_amount,paid_amount);
			//RoomRegistrationDTO rd = new RoomRegistrationDTO();
			RoomRegistrationDTO re;
			
				re = service.registerRoom(details);
				//rd = service.registerRoom;
				System.out.println("Room successfully registered. Room no:"+re);
				logger.info("Executed Successfully");
			
			}
			}
			}
			
			}	
			}
			}
	
	} catch (HotelApplicationException e) {
		
		logger.error("Exception Occured"+e.getMessage());
		//throw new HotelApplicationException("The Exception Occured!!");
		System.out.println(e);
		//h.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Input mismatch");
	}
		
	}
}
