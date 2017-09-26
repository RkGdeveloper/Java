package com.cg.orb.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.orb.dbutil.dbutil;
import com.cg.orb.dto.RoomRegistrationDTO;
import com.cg.orb.exception.HotelApplicationException;

public class RoomRegistrationDAOImpl implements IRoomRegistrationDAO{
	int roomno=0;
	int rows=0;
	@Override
	public RoomRegistrationDTO registerRoom(RoomRegistrationDTO flat) throws HotelApplicationException  {
		RoomRegistrationDTO rd = new RoomRegistrationDTO();
		
		PropertyConfigurator.configure("log4j.properties");
		Logger logger = Logger.getRootLogger();
		
		Connection conn;

		
		try {
			conn = dbutil.getConnection();
			String insertQuery="insert into room_registration values(room_SEQ.nextval,?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(insertQuery);
			ps.setInt(1, flat.getHotel_id());	//we get this variables becoz of getter setters
			ps.setInt(2, flat.getRoom_type());
			ps.setInt(3, flat.getRoom_area());
			ps.setFloat(4, flat.getRent_amount());
			ps.setFloat(5, flat.getPaid_amount());
			
			rows=ps.executeUpdate();
			//System.out.println(rows);
			
			String sql="select room_SEQ.currval from dual";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				roomno = rs.getInt(1);
			}
			
			
			if(roomno>0)
			{
				String sqlq="Select room_no from room_registration where room_no=?";
				PreparedStatement psts=conn.prepareStatement(sqlq);
				psts.setInt(1, roomno);
				ResultSet rsp = pst.executeQuery();
				
				while(rsp.next())
				{
					rd.setRoomno(rsp.getInt(1));
					/*rd.setHotel_id(rsp.getInt(1));
					rd.setRoom_type(rsp.getInt(2));
					rd.setRoom_area(rsp.getInt(3));
					rd.setRent_amount(rsp.getFloat(4));
					rd.setPaid_amount(rsp.getFloat(5));*/
					
				}
				//System.out.println("checkin"+rd);
				logger.info(" DAO layer Executed Successfully");
				
			} 
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new HotelApplicationException(e.getMessage());
		} 
		
		
		return rd;
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException, HotelApplicationException   {
		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			Connection conn=dbutil.getConnection();
			String sqlquery="Select * from hotel_owners";
			
			Statement stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);
			while(rs.next())
			{
				int hotelid = rs.getInt(1);
				list.add(hotelid);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new HotelApplicationException(e.getMessage());
		} 
		
		
		return list;
	}


	public int isHotelid_Exists(int hotel_ownid)   {
		int result = 0;
		
		Connection conn;
		try {
			conn = dbutil.getConnection();
			String str = "select * from hotel_owners where hotel_id=?";
			PreparedStatement ps = conn.prepareStatement(str);
			//System.out.println(mi);
			ps.setInt(1, hotel_ownid);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				result = rs.getInt(1);
			} 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	return result;
		
	}

	
	

}
