package com.crts.app.magna.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan_master_details")
public class LoanMasterDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "lmd_id")
	private int loanMasterDetailsId;
	
	@Column(name = "cust_id")
	private String customerId;
	
	@Column(name = "tenure")
	private int tenure;
	
	@Column(name = "loan_amount")
	private Double loanAmount;
	
	@Column(name = "roi")
	private Double rateOfInterest;
	
	@Column(name = "emi")
	private Double emi;
	
	@Column(name = "actual_emi")
	private Double actualEmi; 
	
	@Column(name = "second_year_insurance")
	private String secondYearInsurance;
	
	@Column(name = "advance_emi")
	private Double advanceEmi;
	
	@Column(name = "processing_fees")
	private Double processingFees;
	
	@Column(name = "paid_to_delear")
	private Double paidToDelear;
	
	@Column(name = "paid_to_mf")
	private Double paidToMf;
	
	@Column(name = "verified_by_cm")
	private String verifiedByCm;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private String createdDate;
	
	@Column(name = "sanction_letter_generation_date")
	private String sanctionLetterGeneratinDate;
	
	@Column(name = "document_updload")
	private String documentUpload;
	
	@Column(name = "document_received_date")
	private String documentRecievedDate;
	
	

}
