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
	@Column(name ="case_no")
	private String caseNumber;
	
	@Column(name ="emi_paid_date")
	private String emiPaidDate;
	
	@Column(name ="emi_paid_amount")
	private Double emiPaidAmount;
	
	@Column (name = "bucket")
	private int bucket;
	
	@Column(name ="total_emi_paid")
	private Double totalEmiPaid; 
	
	
	
	

}
