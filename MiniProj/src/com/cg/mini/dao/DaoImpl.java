package com.cg.mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.mini.bean.Employee;
import com.cg.mini.bean.Login;
import com.cg.mini.utility.DbUtility;

public class DaoImpl implements IDao {

	Connection connection = null;
	PreparedStatement statement = null;
	@Override
	public Boolean addEmp(Employee employee) throws SQLException {
		connection = DbUtility.getConnection();
		boolean flag = false;
		try {
			statement = connection.prepareStatement(QueryConstants.addQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		statement.setString(1, employee.getEmpId());
		statement.setString(2, employee.getFirstName());
		statement.setString(3, employee.getLastName());
		statement.setString(4, employee.getDob());
		statement.setString(5, employee.getDoj());
		statement.setInt(6, employee.getEmpdeptId());
		statement.setString(7, employee.getEmpGrade());
		statement.setString(8, employee.getEmpDesign());
		statement.setDouble(9, employee.getEmpBasic());
		statement.setString(10, employee.getEmpGender());
		statement.setString(11, employee.getEmpMarStatus());
		statement.setString(12, employee.getEmpHomeAdd());
		statement.setString(13, employee.getEmpPhNo());
		statement.setString(14, employee.getMgrId());
		int res = statement.executeUpdate();
		if(res>0)
			flag=true;
		else
			System.out.println("Error in query");
		return flag;
	}

	/*@Override
	public Boolean checkLogin(Login login) throws SQLException {
		boolean flag = false;
		String uName=null;
		String pwd =null;
		ResultSet resultSet=null;
		connection=DbUtility.getConnection();
		statement=connection.prepareStatement(QueryConstants.loginQuery);
		resultSet=statement.executeQuery();
		while (resultSet.next()) {
			uName=resultSet.getString(1);
			pwd=resultSet.getString(2);
			
		}
		if(login.getUserName().equals(uName) && login.getPassword().equals(pwd))
			flag=true;
		return flag;
	}*/

}
