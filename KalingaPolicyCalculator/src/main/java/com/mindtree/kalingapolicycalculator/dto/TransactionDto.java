package com.mindtree.kalingapolicycalculator.dto;

import java.sql.Date;


public class TransactionDto {

	private int TransactionId;
	private double monthlyTransactionAmount;
	private boolean isActive;
	private Date startingDate;
	
	private PolicyDto policy;

	public TransactionDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionDto(int transactionId, double monthlyTransactionAmount, boolean isActive, Date startingDate,
			PolicyDto policy) {
		super();
		TransactionId = transactionId;
		this.monthlyTransactionAmount = monthlyTransactionAmount;
		this.isActive = isActive;
		this.startingDate = startingDate;
		this.policy = policy;
	}

	public int getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(int transactionId) {
		TransactionId = transactionId;
	}

	public double getMonthlyTransactionAmount() {
		return monthlyTransactionAmount;
	}

	public void setMonthlyTransactionAmount(double monthlyTransactionAmount) {
		this.monthlyTransactionAmount = monthlyTransactionAmount;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public PolicyDto getPolicy() {
		return policy;
	}

	public void setPolicy(PolicyDto policy) {
		this.policy = policy;
	}

	
	
}
