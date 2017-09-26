package com.cg.orb.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.*;

import com.cg.orb.dao.IRoomRegistrationDAO;
import com.cg.orb.dao.RoomRegistrationDAOImpl;
import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.HotelApplicationException;


public class HotelTestData {
	static IRoomRegistrationDAO dao=null;
	static RoomRegistrationDTO bean=null;
	
	@BeforeClass
	public static void initialize() {
		dao=new RoomRegistrationDAOImpl();
		bean=new RoomRegistrationDTO();
		
	}
	@Test
	public void testData()
	{
		bean.setHotel_id(1);
		bean.setRoom_type(2);
		bean.setRoom_area(5000);
		bean.setRent_amount(255.00f);
		bean.setPaid_amount(450.00f);
	}
	
	@Test
	public void testAddDetails() throws HotelApplicationException, IOException, SQLException
	{
		
			try {
				assertNotNull(dao.registerRoom(bean));
			} catch (HotelApplicationException e) {
				
				throw new HotelApplicationException("The Exception Occured!!");
			}
		
	}
	/*@Test
	public void getDetails()
	{
		assertNotNull(dao.());
	}*/

}