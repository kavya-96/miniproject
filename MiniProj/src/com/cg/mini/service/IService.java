package com.cg.mini.service;

import java.sql.SQLException;

import com.cg.mini.bean.Employee;
import com.cg.mini.bean.Login;

public interface IService {
	public Boolean addEmp(Employee employee) throws SQLException;
	//public Boolean checkLogin(Login login) throws SQLException;

}
