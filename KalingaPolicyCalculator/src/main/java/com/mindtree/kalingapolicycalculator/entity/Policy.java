package com.mindtree.kalingapolicycalculator.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policy {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int policyId;
	private String  policyName;
	private double rateOfInterest;
	private int  maturityTerm;
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Policy(int policyId, String policyName, double rateOfInterest, int maturityTerm) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.rateOfInterest = rateOfInterest;
		this.maturityTerm = maturityTerm;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getMaturityTerm() {
		return maturityTerm;
	}
	public void setMaturityTerm(int maturityTerm) {
		this.maturityTerm = maturityTerm;
	}
	
	
	
}
