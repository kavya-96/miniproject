package com.cg.mini.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.cg.mini.bean.Employee;
import com.cg.mini.bean.Login;
import com.cg.mini.service.IService;
import com.cg.mini.service.ServiceImpl;

public class Controller {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		IService service = new ServiceImpl();
		
		System.out.println("Login");
		System.out.println("****************");
		System.out.println("Enter username");
		String userName = scanner.nextLine();
		System.out.println("Enter password");
		String password = scanner.nextLine();
		Login login = new Login(userName, password);
		
		/*Boolean loginRes=false;
		try {
			loginRes = service.checkLogin(login);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		if(userName.equals("kavya") && password.equals("kavya@123")){
			System.out.println("Enter choice");
			System.out.println("1.Add Details");
			System.out.println("2.Exit");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				scanner.nextLine();
				System.out.println("Enter Emp Id");
				String id = scanner.nextLine();
				System.out.println("Enter Emp first name");
				String fName = scanner.nextLine();
				System.out.println("Enter Emp last name");
				String lName = scanner.nextLine();
				System.out.println("Enter Emp DOB");
				String dob = scanner.nextLine();
				System.out.println("Enter Emp DoJ");
				String doj = scanner.nextLine();
				System.out.println("Enter Emp dept id");
				int deptId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Emp grade");
				String grade = scanner.nextLine();
				System.out.println("Enter Emp desig");
				String desig = scanner.nextLine();
				System.out.println("Enter Emp salary");
				double salary = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Enter Emp gender");
				String gender = scanner.nextLine();
				System.out.println("Enter Emp marital status");
				String maritalStatus = scanner.nextLine();
				System.out.println("Enter Emp address");
				String address = scanner.nextLine();
				System.out.println("Enter Emp phone num");
				String phNo = scanner.nextLine();
				System.out.println("Enter Emp manager Id");
				String MngrId = scanner.nextLine();
				
				Employee employee = new Employee(id, fName, lName, dob, doj, deptId, grade, desig, salary, gender, maritalStatus, address, phNo, MngrId);
				boolean addRes = false;
				try {
					addRes = service.addEmp(employee);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(addRes){
					System.out.println("Details added");
				}
				else {
					System.out.println("Error...");
				}
				break;

			default:
				System.out.println("Choose correct option");
				break;
			}
		}
		
	}

}
