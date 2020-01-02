package com.mindtree.kalingapolicycalculator.dto;

import java.util.List;

import com.mindtree.kalingapolicycalculator.entity.Transaction;

public class CustomerDto {

	private int customerId;
	private String customerName;
	
	private List<TransactionDto> transactions;

	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDto(int customerId, String customerName, List<TransactionDto> transactions) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.transactions = transactions;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<TransactionDto> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionDto> transactions) {
		this.transactions = transactions;
	}

	
	
}
