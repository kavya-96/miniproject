package com.cg.mini.bean;

public class Employee {
	String empId;
	String firstName;
	String lastName;
	String dob;
	String doj;
	int empdeptId;
	String empGrade;
	String empDesign;
	double empBasic;
	String empGender;
	String empMarStatus;
	String empHomeAdd;
	String empPhNo;
	String mgrId;

	public Employee(String empId, String firstName, String lastName,
			String dob, String doj, int empdeptId, String empGrade,
			String empDesign, double empBasic, String empGender,
			String empMarStatus, String empHomeAdd, String empPhNo, String mgrId) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.doj = doj;
		this.empdeptId = empdeptId;
		this.empGrade = empGrade;
		this.empDesign = empDesign;
		this.empBasic = empBasic;
		this.empGender = empGender;
		this.empMarStatus = empMarStatus;
		this.empHomeAdd = empHomeAdd;
		this.empPhNo = empPhNo;
		this.mgrId = mgrId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public int getEmpdeptId() {
		return empdeptId;
	}

	public void setEmpdeptId(int empdeptId) {
		this.empdeptId = empdeptId;
	}

	public String getEmpGrade() {
		return empGrade;
	}

	public void setEmpGrade(String empGrade) {
		this.empGrade = empGrade;
	}

	public String getEmpDesign() {
		return empDesign;
	}

	public void setEmpDesign(String empDesign) {
		this.empDesign = empDesign;
	}

	public double getEmpBasic() {
		return empBasic;
	}

	public void setEmpBasic(double empBasic) {
		this.empBasic = empBasic;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public String getEmpMarStatus() {
		return empMarStatus;
	}

	public void setEmpMarStatus(String empMarStatus) {
		this.empMarStatus = empMarStatus;
	}

	public String getEmpHomeAdd() {
		return empHomeAdd;
	}

	public void setEmpHomeAdd(String empHomeAdd) {
		this.empHomeAdd = empHomeAdd;
	}

	public String getEmpPhNo() {
		return empPhNo;
	}

	public void setEmpPhNo(String empPhNo) {
		this.empPhNo = empPhNo;
	}

	public String getMgrId() {
		return mgrId;
	}

	public void setMgrId(String mgrId) {
		this.mgrId = mgrId;
	}

}
