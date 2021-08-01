package com.Bankapp.bo;

import java.util.List;

import com.Bankapp.bankmanagement.Employee;
import com.Bankapp.dao.EmployeeDAO;
import com.Bankapp.dao.EmployeeDAOImplementation;


public class EmployeeBOImplementation implements EmployeeBO{

	@Override
	public int newUser(Employee emp) {
		EmployeeDAO udao=new EmployeeDAOImplementation();
		int status =udao.newEmployee(emp);
		return status;
	}

	@Override
	public List<Employee> existingEmployee(int EmployeeId) {
		// TODO Auto-generated method stub
		EmployeeDAO udao=new EmployeeDAOImplementation();
		List<Employee> status=udao.existingEmployee(EmployeeId);
		return status;
	}

}
