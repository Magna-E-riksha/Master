package com.crts.app.magna.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mf_ledgerDetails")
public class LedgerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ld_id")
	// primary key
	private int ledgerDetailsId;
	
	//foreign key
	private String CustomerId;
	
	// take from table loan disbursement details
	private String caseNumber;
	
	// foreign key 
	@Column (name = "lmd_id")
	private String loanMasterDetailsId;
	
	private Double totalAmount;
	
	private int tenure;
	
	private Double emi; 
	
	private Double advanceEmi; 
	
	private String emiStartDate;
	
	private String emiEndDate;
	
	private String ledgerCreatedDate;
	
	@Column(name ="ld_emi_paid_amt")
	private Double ledgerDetailsEMIPaidAmount;

	public int getLedgerDetailsId() {
		return ledgerDetailsId;
	}

	public void setLedgerDetailsId(int ledgerDetailsId) {
		this.ledgerDetailsId = ledgerDetailsId;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getLoanMasterDetailsId() {
		return loanMasterDetailsId;
	}

	public void setLoanMasterDetailsId(String loanMasterDetailsId) {
		this.loanMasterDetailsId = loanMasterDetailsId;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}

	public Double getAdvanceEmi() {
		return advanceEmi;
	}

	public void setAdvanceEmi(Double advanceEmi) {
		this.advanceEmi = advanceEmi;
	}

	public String getEmiStartDate() {
		return emiStartDate;
	}

	public void setEmiStartDate(String emiStartDate) {
		this.emiStartDate = emiStartDate;
	}

	public String getEmiEndDate() {
		return emiEndDate;
	}

	public void setEmiEndDate(String emiEndDate) {
		this.emiEndDate = emiEndDate;
	}

	public String getLedgerCreatedDate() {
		return ledgerCreatedDate;
	}

	public void setLedgerCreatedDate(String ledgerCreatedDate) {
		this.ledgerCreatedDate = ledgerCreatedDate;
	}

	public Double getLedgerDetailsEMIPaidAmount() {
		return ledgerDetailsEMIPaidAmount;
	}

	public void setLedgerDetailsEMIPaidAmount(Double ledgerDetailsEMIPaidAmount) {
		this.ledgerDetailsEMIPaidAmount = ledgerDetailsEMIPaidAmount;
	}

	

}
