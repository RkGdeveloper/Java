package com.cg.recharge.dbutil;

import java.io.*;
import java.sql.*;
import java.util.*;

	public class DbUtil {
		public static Connection getConnection() throws SQLException, IOException{
			Connection conn=null;
			Properties prop=readDbInfo();
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			conn=DriverManager.getConnection(url,username,password);
			return conn;
		}
		private static Properties readDbInfo() throws IOException{
			Properties p = new Properties();
			FileReader fr = new FileReader("recharge.properties");
			p.load(fr);
			return p;
		}
	

}
