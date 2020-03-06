package com.capgmini.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class JdbcDemo3 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt =null;
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			DriverManager.registerDriver(new OracleDriver());
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			if(con!=null) {
				String query ="insert into emp(emp_id,emp_name,sal,dept_id,doj)values(207,'Avinash', 22000, 10, '13-feb-2020')";
				pstmt = con.prepareStatement(query);
				int result = pstmt.executeUpdate();
				System.out.println(result+" Record got inserted");
			}
		} catch (SQLException e) {
			System.out.println("Exception: "+e.getMessage());
		}
		finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

}
