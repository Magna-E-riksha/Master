package com.crts.app.magna.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mf_m_loanDisbursementMaster")
public class LoanDisbursmentMaster {
	
	@Id
	@Column(name = "ldm_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanDisbursementMasterId;
	
	@Column(name = "case_no")
	private String caseNumber;
	
	@Column(name = "amount_pay_type")
	private String amountPayType;
	
	@Column(name = "total_amount")
	private Double totalAmount;
	
	@Column(name = "mf_ac_number")
	private Long mangaFinanceaccountNumber;
	
	@Column(name = "mf_ifsc_code")
	private String magnaFinanceIFSCCode;
	
	@Column(name = "account_type")
	private String accountType;
	
	@Column(name = "transfer_amount")
	private Double transferAmount;
	
	@Column(name = "status")
	private String paymentStatus;
	
	@Column(name = "amount_paid_date")
	private String amountPaidDate;
	
	

}
