package com.crts.app.magna.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mf_ledgerUpdationDetails")
public class LedgerUpdationDetails {
	
	//primary key
	@Id
	@Column(name ="lud_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerUpdationDetailsId;
	
	//foreign Key
	@Column(name ="ld_id")
	private String ledgerDetailsId;
	
	//need to get from mf_ledger_details table
	private String caseNumber;
	
	private String emiPaidDate;
	
	private Double emiPaidAmount;
	
	private int bucket;
	
	private Double totalEmiPaid;

	public int getLedgerUpdationDetailsId() {
		return ledgerUpdationDetailsId;
	}

	public void setLedgerUpdationDetailsId(int ledgerUpdationDetailsId) {
		this.ledgerUpdationDetailsId = ledgerUpdationDetailsId;
	}

	public String getLedgerDetailsId() {
		return ledgerDetailsId;
	}

	public void setLedgerDetailsId(String ledgerDetailsId) {
		this.ledgerDetailsId = ledgerDetailsId;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getEmiPaidDate() {
		return emiPaidDate;
	}

	public void setEmiPaidDate(String emiPaidDate) {
		this.emiPaidDate = emiPaidDate;
	}

	public Double getEmiPaidAmount() {
		return emiPaidAmount;
	}

	public void setEmiPaidAmount(Double emiPaidAmount) {
		this.emiPaidAmount = emiPaidAmount;
	}

	public int getBucket() {
		return bucket;
	}

	public void setBucket(int bucket) {
		this.bucket = bucket;
	}

	public Double getTotalEmiPaid() {
		return totalEmiPaid;
	}

	public void setTotalEmiPaid(Double totalEmiPaid) {
		this.totalEmiPaid = totalEmiPaid;
	} 
	
	
	
	

}
