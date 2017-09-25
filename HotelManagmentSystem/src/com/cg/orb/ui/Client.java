package com.cg.orb.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.service.IRoomRegistrationService;
import com.cg.orb.service.RoomRegistrationServiceImpl;


public class Client {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException, SQLException {
		
		Client c =  new Client();
		c.userChoice();
	}
	
	
	void userChoice() throws IOException, SQLException{
		while(true)
		{
		System.out.println("==============\n1.Booking Room\n2.Exit\n=============");
		int choice = sc.nextInt();
		
			switch(choice){
			case 1: 
				bookRoom();
				
			break;
			case 2:
				{
				System.out.println("ThankYou..... Visit Again....");
				System.exit(0);
				}
		}	
		}
	}

	private void bookRoom() throws IOException, SQLException {
		
		IRoomRegistrationService irs =new RoomRegistrationServiceImpl();
		ArrayList<Integer> hotel_ids = new ArrayList<Integer>(); 
		hotel_ids = irs.getAllOwnerIds();
		System.out.println("Existing HotelOwner IDS Are:-"+hotel_ids);
		System.out.println("Please enter your hotel owner id from above list: ");
		int h_id = sc.nextInt();
		System.out.println("Select  room type Type (1-1AC, 2-2NON-AC):");
		int roomType = sc.nextInt();
		System.out.println("Enter room area in sq. ft.: ");
		int area = sc.nextInt();
		System.out.println("Enter desired rent amount Rs: ");
		double rentAmt = sc.nextDouble();
		System.out.println("Enter desired paid amount Rs: ");
		double paidAmt = sc.nextDouble();
		RoomRegistrationDTO rd = new RoomRegistrationDTO(h_id, roomType, area, rentAmt, paidAmt);		
		if(irs.checkValidRoomDetails(rd))
		{
		RoomRegistrationDTO roomReg = irs.registerRoom(rd);
		
		System.out.println("Room successfully registered. Room no:<"+roomReg.getRoomNo()+">");
		}
		
	}
	
}
