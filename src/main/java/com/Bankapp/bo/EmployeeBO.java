package com.Bankapp.bo;

import java.util.List;

import com.Bankapp.bankmanagement.Employee;

public interface EmployeeBO {
	public int newUser(Employee emp);
	public List<Employee> existingEmployee(int EmployeeeId);
}
