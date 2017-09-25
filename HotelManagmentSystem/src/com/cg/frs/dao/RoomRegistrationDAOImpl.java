package com.cg.frs.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.frs.dbconfig.Hotel_DbUtil;
import com.cg.orb.dto.RoomRegistrationDTO;

public class RoomRegistrationDAOImpl implements IRoomRegistrationDAO {

	@Override
	public RoomRegistrationDTO registerRoom(RoomRegistrationDTO flat) throws SQLException, IOException {
		Connection con = Hotel_DbUtil.getConnection();
		String str = "INSERT Into room_registration values(room_SEQ.nextval,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(str);
		pst.setInt(1,flat.getHotelId());
		pst.setInt(2,flat.getRoomType());
		pst.setInt(3,flat.getRoomArea());
		pst.setDouble(4,flat.getRentAmt());
		pst.setDouble(5,flat.getPaidAmt());
		int r = pst.executeUpdate();
		
		
		
		RoomRegistrationDTO rd = new RoomRegistrationDTO();
		
		String sql = "select room_SEQ.currval from dual";
		Statement stmt = con.createStatement();
		ResultSet rc = stmt.executeQuery(sql);
		int room_no = 0;
		
		while(rc.next())
		{
			 room_no= rc.getInt(1);
		}
		
		
		
		if(r > 0){
			String s = "Select * from room_registration where room_no = ?"; 
			PreparedStatement st = con.prepareStatement(s);
			st.setInt(1, room_no);
			ResultSet rs = st.executeQuery();
			while(rs.next()){
				rd.setRoomNo(rs.getInt(1));
				rd.setHotelId(rs.getInt(2));
				rd.setRoomType(rs.getInt(3));
				rd.setRoomArea(rs.getInt(4));
				rd.setRentAmt(rs.getDouble(5));
				rd.setPaidAmt(rs.getDouble(6));
			}
			
		}
		
		return rd;
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException {
	
		ArrayList<Integer> hotel_ids= new ArrayList<Integer>();
		Connection con = Hotel_DbUtil.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select hotel_id from hotel_owners");
		while(rs.next())
		{
			hotel_ids.add(rs.getInt(1));
		}
		
		return hotel_ids;
	}

}
