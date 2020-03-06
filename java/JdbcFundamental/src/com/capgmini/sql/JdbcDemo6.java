package com.capgmini.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class JdbcDemo6 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt =null;
		int eid = 207;
		//String ename = "Sachin";
		//double sal = 1100*5;
		//int dept=10;
		//String doj = "13-jul-2020";
		try {
			
			/*
			 * //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			 * //DriverManager.registerDriver(new OracleDriver());
			 */		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			con.setAutoCommit(false);
			
			if(con!=null) {
				String query ="delete from emp  where emp_id=?";
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1,eid);
				//pstmt.setString(2,ename);
				//pstmt.setDouble(1,sal);
				//pstmt.setInt(4,dept);
				//pstmt.setString(5,doj);
				
				int result = pstmt.executeUpdate();
				if(result >= 1) {
					con.commit();
					System.out.println(result+" Record got inserted");
				}
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			//System.out.println("Exception: "+e.getMessage());
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				//System.out.println(e.getMessage());
				e.printStackTrace();
			}
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
