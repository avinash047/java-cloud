package com.capgmini.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo1 {

	public static void main(String[] args) {
		//DriverManager.registerDriver(new driver());
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			if(con!=null) {
				System.out.println("Connection to the database is sucessful.");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
		}
	}

}
