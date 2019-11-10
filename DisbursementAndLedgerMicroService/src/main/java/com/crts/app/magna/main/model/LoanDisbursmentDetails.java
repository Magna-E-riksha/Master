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
	@Column(name = "case_no")
	private String caseNumber;
	
	//foreign key
	@Column(name = "vd_id")
	private String vehicleDetailsId;
	
	@Column(name = "paid_to_delear_amount")
	private Double paidToDelearAmount;
	
	@Column(name = "loan_amount")
	private Double loanAmount;
	
	@Column(name = "tenure")
	private int tenure;
	
	@Column(name = "actual_emi")
	private Double actualEmi;
	
	//account head id
	@Column(name = "disbursement_by")
	private String disbursementBy;
	
	@Column(name = "disbursement_date")
	private String disbursementDate;
	

}
