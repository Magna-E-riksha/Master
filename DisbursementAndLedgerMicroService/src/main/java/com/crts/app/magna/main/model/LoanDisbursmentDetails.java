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
	private int loanMasterDetailsId;

	// Generate according to branch
	@Column(name = "case_no")
	private String caseNumber;
	
	//foreign key
	@Column(name = "vd_id")
	private String vehicleDetailsId;
	
	private Double paidToDelearAmount;
	
	private Double loanAmount;
	
	private int tenure;
	private Double emi;
	
	public int getLoanMasterDetailsId() {
		return loanMasterDetailsId;
	}

	public void setLoanMasterDetailsId(int loanMasterDetailsId) {
		this.loanMasterDetailsId = loanMasterDetailsId;
	}

	public Double getAdvanceEmi() {
		return advanceEmi;
	}

	public void setAdvanceEmi(Double advanceEmi) {
		this.advanceEmi = advanceEmi;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}

	private Double advanceEmi;
	
	
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
