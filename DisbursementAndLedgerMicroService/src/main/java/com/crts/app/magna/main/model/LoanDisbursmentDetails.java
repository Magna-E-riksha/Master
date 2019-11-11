package com.crts.app.magna.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mf_loanDisbursmentDetails")
public class LoanDisbursmentDetails {
	
	//primary key
	@Id
	@Column(name = "ld_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanDisbursmentId;
	
	//foreign key
	@Column(name = "loan_master")
	private String loanMasterDetails;

	// Generate according to branch
	private String caseNumber;
	
	//foreign key
	@Column(name = "vd_id")
	private String vehicleDetailsId;
	
	private Double paidToDelearAmount;
	
	private Double loanAmount;
	
	private int tenure;
	
	private Double actualEmi;
	
	//account head id
	private String disbursementBy;
	
	private String disbursementDate;

	public int getLoanDisbursmentId() {
		return loanDisbursmentId;
	}

	public void setLoanDisbursmentId(int loanDisbursmentId) {
		this.loanDisbursmentId = loanDisbursmentId;
	}

	public String getLoanMasterDetails() {
		return loanMasterDetails;
	}

	public void setLoanMasterDetails(String loanMasterDetails) {
		this.loanMasterDetails = loanMasterDetails;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getVehicleDetailsId() {
		return vehicleDetailsId;
	}

	public void setVehicleDetailsId(String vehicleDetailsId) {
		this.vehicleDetailsId = vehicleDetailsId;
	}

	public Double getPaidToDelearAmount() {
		return paidToDelearAmount;
	}

	public void setPaidToDelearAmount(Double paidToDelearAmount) {
		this.paidToDelearAmount = paidToDelearAmount;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public Double getActualEmi() {
		return actualEmi;
	}

	public void setActualEmi(Double actualEmi) {
		this.actualEmi = actualEmi;
	}

	public String getDisbursementBy() {
		return disbursementBy;
	}

	public void setDisbursementBy(String disbursementBy) {
		this.disbursementBy = disbursementBy;
	}

	public String getDisbursementDate() {
		return disbursementDate;
	}

	public void setDisbursementDate(String disbursementDate) {
		this.disbursementDate = disbursementDate;
	}
	

}
