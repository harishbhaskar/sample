package com.mindtree.kalingapolicycalculator.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int TransactionId;
	private double monthlyTransactionAmount;
	private boolean isActive;
	private Date startingDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Policy policy;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int transactionId, double monthlyTransactionAmount, boolean isActive, Date startingDate,
			Policy policy) {
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

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	
	
}
