package com.Bankapp.bo;

import java.util.List;

import com.Bankapp.bankmanagement.Customer;
import com.Bankapp.bankmanagement.CustomerTransaction;

public interface CustomerBO {
		public int newCustomer(Customer cust);
		public List<Customer> existingCustomer(long CustomerAccountNumber);
		public int depoist(long customerAccountNumber,double currentAmount,double creditedAmount);
		public int withdraw(long customerAccountNumber,double currentAmount,double debitedAmount);
		public List<CustomerTransaction> customerTransaction(long CustomerAccountNumber);
		}