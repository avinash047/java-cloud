package com.capgmini.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {

	public static void main(String[] args) {
		//DriverManager.registerDriver(new driver());
		ResultSet rs =null;
		Statement stmt =null;
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			if(con!=null) {
				stmt =con.createStatement();
				String query = "select * from emp";
				rs = stmt.executeQuery(query);
				while(rs.next()) {
					String ename = rs.getString("emp_name");
					int eid = rs.getInt("emp_id");
					double esal = rs.getDouble("sal");
					
					System.out.printf("%d, %s, %f\n",eid,ename,esal);
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
		}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("SQLException: "+e.getMessage());
			}
			
		}
	}

}
