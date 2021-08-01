package com.Bankapp.client;

import java.util.List;
import java.util.Scanner;

import com.Bankapp.bankmanagement.Customer;
import com.Bankapp.bankmanagement.Employee;
import com.Bankapp.bo.CustomerBO;
import com.Bankapp.bo.CustomerBOImplementation;
import com.Bankapp.bo.EmployeeBO;
import com.Bankapp.bo.EmployeeBOImplementation;

public class EmployeeMain {
	static Scanner sc=new Scanner(System.in);
	public static void newMain() {
	   System.out.println("If you are new Employee please enter the required details in below:");
		System.out.println("Enter your Name:");
		String uname = sc.nextLine();
		System.out.println("Enter the Password:");
		String upass=sc.nextLine();
		System.out.println("Enter the Mail Id:");
		String umail=sc.nextLine();
		System.out.println("Enter the Mobile Number:");
		long umob=sc.nextLong();
		Employee emp=new Employee();
		emp.setEmployeeName(uname);
		emp.setPassword(upass);
		emp.setMailId(umail);
		emp.setMobileNumber(umob);
		EmployeeBO ubo=new EmployeeBOImplementation();
		int state=ubo.newUser(emp);
		if(state!=0) {
			System.out.println("Userdetails added successfully");
		}else {
			System.out.println("Userdetails Not added successfully");
		}
	}
	public static void existingMain() {
	System.out.println("If you are existing Employee please login here:");
	System.out.println("Enter Employee Id:");
	int exuid=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the Password:");
	String exupass=sc.nextLine();
	Employee emp=new Employee();
	emp.setEmployeeId(exuid);
	emp.setPassword(exupass);
	String s=null;
	EmployeeBO ubo=new EmployeeBOImplementation();
	List<Employee> lu=ubo.existingEmployee(exuid);
	for(Employee e:lu) {
		s=e.getPassword();
	}
		if(s.equalsIgnoreCase(exupass)) {
			System.out.println("Employee Login Success!");
			System.out.println("1. See Customer Account Details");
			
			System.out.println("Please enter your choice");
			int cdetails=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Customer Account Number:");
			long caccount = sc.nextLong();
			Customer cust=new Customer();
			cust.setCustomerAccountNumber(caccount);
			CustomerBO cbo=new CustomerBOImplementation();
			List<Customer> lc=cbo.existingCustomer(caccount);
			for(Customer c:lc) {
				String cname=c.getCustomerName();
				double ccamount=c.getCurrentAmount();
		        double ccredit=c.getCreditedAmount();
		        double cdebit=c.getDebitedAmount();
					switch(cdetails) {
					case 1:
						System.out.println("CustomerAccountNumber:"+" "+caccount);
						System.out.println("CustomerName:"+" "+cname);
						System.out.println("CurrentAmount:"+" "+ccamount);
						System.out.println("CreditedAmount:"+" "+ccredit);
						System.out.println("DebitedAmount:"+" "+cdebit);
					    break;
					default:
					    	System.out.println("Enter Correct Choice!");
					}
					
			}
		}else {
			System.out.println("Employee Login Fail!");
		}
	}			
}

