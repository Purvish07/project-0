package com.Bankapp.client;

import java.util.List;
import java.util.Scanner;



import com.Bankapp.bankmanagement.CustomerTransaction;
import com.Bankapp.bo.CustomerBO;
import com.Bankapp.bo.CustomerBOImplementation;

public class BankManagement {
		static Scanner sc=new Scanner(System.in);
		public static void main(String args[]) {
			System.out.println("**********/----Welcome to the Bank Management System---/***********");
			while(true) {
			System.out.println("1. New Employee");
			System.out.println("2. Existing Employee");
			System.out.println("3. New Customer");
			System.out.println("4. Existing Customer");
			System.out.println("Enter your choice:");
	        int input=sc.nextInt();
	        sc.nextLine();
	        switch(input) {
	        case 1:
	        	EmployeeMain.newMain();
	        	break;
	        case 2:
	        	EmployeeMain.existingMain();
	        	break;
	        case 3:
	        	CustomerMain.newCustomer();
	        	break;
	        case 4:
	        	CustomerMain.existingCustomer();
	        	break;
	        case 5:
	        	System.out.println("Enter Account Number:");
	    		long caccount = sc.nextLong();
	        	CustomerTransaction cus=new CustomerTransaction();
				cus.setCustomerAccountNumber(caccount);
				CustomerBO cbo=new CustomerBOImplementation();
				List<CustomerTransaction> lc1=cbo.customerTransaction(caccount);
				for(CustomerTransaction c:lc1) {
					//double ccamount=c.getCurrentAmount();
			        double ccredit1=c.getCreditedAmount();
			        double cdebit1=c.getDebitedAmount();
			        System.out.println("CustomerAccountNumber:"+" "+caccount);
					//System.out.println("CurrentAmount:"+" "+ccamount);
					System.out.println("CreditedAmount:"+" "+ccredit1);
					System.out.println("DebitedAmount:"+" "+cdebit1);
					System.out.println("***********");
				}
	        default:
	        	System.out.println("Please enter correct choice!");
	        	break;
	        }
	}	
}
}
