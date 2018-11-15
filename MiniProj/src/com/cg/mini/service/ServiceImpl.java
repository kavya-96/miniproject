package com.cg.mini.service;

import java.sql.SQLException;

import com.cg.mini.bean.Employee;
import com.cg.mini.bean.Login;
import com.cg.mini.dao.DaoImpl;
import com.cg.mini.dao.IDao;

public class ServiceImpl implements IService {

	IDao ref = new DaoImpl();
	@Override
	public Boolean addEmp(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return ref.addEmp(employee);
	}
	/*@Override
	public Boolean checkLogin(Login login) throws SQLException {
		// TODO Auto-generated method stub
		return ref.checkLogin(login);
	}*/
	
	

}
