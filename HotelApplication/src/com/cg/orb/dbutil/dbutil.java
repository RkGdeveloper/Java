package com.cg.orb.dbutil;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbutil {

	public static Connection getConnection() throws IOException, SQLException
	{
		Connection conn=null;
		Properties prop = readDbInfo();
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		conn=DriverManager.getConnection(url,username,password);
		return conn;
	}
	private static Properties readDbInfo() throws IOException
	{
		Properties p = new Properties();
		FileReader fr = new FileReader("dbinfo.properties");	//Provide property file here
		p.load(fr);
		return p;
	}
}
