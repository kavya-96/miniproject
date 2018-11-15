package com.cg.mini.dao;

import java.sql.SQLException;

import com.cg.mini.bean.Employee;
import com.cg.mini.bean.Login;

public interface IDao {

	Boolean addEmp(Employee employee) throws SQLException;

	//Boolean checkLogin(Login login) throws SQLException;

}
