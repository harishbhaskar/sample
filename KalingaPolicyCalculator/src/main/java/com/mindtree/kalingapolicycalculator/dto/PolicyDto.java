package com.mindtree.kalingapolicycalculator.dto;

public class PolicyDto {

	private int policyId;
	private String  policyName;
	private double rateOfInterest;
	private int maturityTerm;
	public PolicyDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolicyDto(int policyId, String policyName, double rateOfInterest, int maturityTerm) {
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
