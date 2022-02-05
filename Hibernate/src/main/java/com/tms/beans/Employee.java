package com.tms.beans;

import javax.persistence.Id;

import java.util.List;

import lombok.Data;

/**
 * 
 * @author Mohit
 * @see Employee bean class
 * @since February, 2022
 */

@Data
public class Employee {

	@Id
	private int empId;
	private String employeeEmail;
	private String employeeName;
	private String employeePassword;
	private int phoneNo;
	private String employeeDOB;
	private String employeeAdd;
	private String employeeSocials;

	private ClassroomBean classroomData = ClassroomBean.getClassInstance();
	
	private List<Feedbacks> feedBacks;

	private static final Employee employee = new Employee();

	private Employee() {
		System.out.println("Employee created");
	}

	public Employee(Employee employee) {
		System.out.println("Duplicate Employee created ");
	}

	public static Employee getEmployeeInstance() {
		return employee;
	}

	// SignUP Builder....
	public Employee setEmployeeEmail(String email) {
		this.employeeEmail = email;
		return this;
	}

	public Employee setEmployeePassword(String password) {
		this.employeePassword = password;
		return this;
	}

	public Employee setEmployeeName(String name) {
		this.employeeName = name;
		return this;
	}

	public Employee build() {
		return employee;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employeeEmail=" + employeeEmail + ", employeeName=" + employeeName
				+ ", employeePassword=" + employeePassword + ", phoneNo=" + phoneNo + ", employeeDOB=" + employeeDOB
				+ ", employeeAdd=" + employeeAdd + ", employeeSocials=" + employeeSocials + "]";
	}

}
