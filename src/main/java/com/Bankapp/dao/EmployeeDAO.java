package com.Bankapp.dao;

import java.util.List;

import com.Bankapp.bankmanagement.Employee;

public interface EmployeeDAO {
	public int newEmployee(Employee emp);
	public List<Employee> existingEmployee(int EmployeeId);
}

