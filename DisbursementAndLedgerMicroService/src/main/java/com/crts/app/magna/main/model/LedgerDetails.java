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
	
	@Column(name = "cust_id")
	//foreign key
	private String CustomerId;
	
	// take from table loan disbursement details
	@Column(name = "case_no")
	private String caseNumber;
	
	// foreign key 
	@Column (name = "lmd_id")
	private String loanMasterDetailsId;
	
	@Column(name = "total_amount")
	private Double totalAmount;
	
	@Column(name ="tenure")
	private int tenure;
	
	@Column(name ="emi")
	private Double emi; 
	
	@Column(name ="advance_emi")
	private Double advanceEmi; 
	
	@Column(name ="emi_start_date")
	private String emiStartDate;
	
	@Column(name ="emi_end_date")
	private String emiEndDate;
	
	@Column(name ="ledger_created_date")
	private String ledgerCreatedDate;
	
	@Column(name ="ld_emi_paid_amt")
	private Double ledgerDetailsEMIPaidAmount;

	

}
