package com.capgemini.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import com.capgemini.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{


	@Override
	public int createEmployee(Employee employee) {
		
		String sql = "insert into emp(emp_id,emp_name,sal,dept_id,doj)values(?,?,?,?,?)";
		int result=0;
		try(
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");	
				
			PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				pstmt.setInt(1, employee.getEmployeeId());
				pstmt.setString(2, employee.getEmployeeName());
				pstmt.setDouble(3, employee.getEmployeeSalary());
				pstmt.setInt(4, employee.getDeptartmentId());
				pstmt.setDate(5, Date.valueOf(employee.getEmployeeDoj()));
				
				pstmt.executeUpdate();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		Employee emp =null;
		try(
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");	
					
				Statement stmt = conn.createStatement();
				){
			String sql ="select * from emp where emp_id="+employeeId;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int empid = rs.getInt("EMP_ID");
				String empname = rs.getString("EMP_NAME");
				double empsal =rs.getDouble("SAL");
				int deptid = rs.getInt("DEPT_ID");
				LocalDate doj = rs.getDate("DOJ").toLocalDate();
				
				emp =new Employee(empid,empname,empsal,deptid,doj);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return emp;
	}

}
