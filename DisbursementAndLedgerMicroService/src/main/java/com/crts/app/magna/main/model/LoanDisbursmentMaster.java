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
	private String caseNumber;
	private String amountPayType;
	private Double totalAmount;

	@Column(name = "mf_ac_number")
	private Long mangaFinanceaccountNumber;
	
	@Column(name = "mf_ifsc_code")
	private String magnaFinanceIFSCCode;
	private String accountType;
	private Double transferAmount;
	
	@Column(name = "status")
	private String paymentStatus;
	private String amountPaidDate;

	public int getLoanDisbursementMasterId() {
		return loanDisbursementMasterId;
	}

	public void setLoanDisbursementMasterId(int loanDisbursementMasterId) {
		this.loanDisbursementMasterId = loanDisbursementMasterId;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getAmountPayType() {
		return amountPayType;
	}

	public void setAmountPayType(String amountPayType) {
		this.amountPayType = amountPayType;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getMangaFinanceaccountNumber() {
		return mangaFinanceaccountNumber;
	}

	public void setMangaFinanceaccountNumber(Long mangaFinanceaccountNumber) {
		this.mangaFinanceaccountNumber = mangaFinanceaccountNumber;
	}

	public String getMagnaFinanceIFSCCode() {
		return magnaFinanceIFSCCode;
	}

	public void setMagnaFinanceIFSCCode(String magnaFinanceIFSCCode) {
		this.magnaFinanceIFSCCode = magnaFinanceIFSCCode;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(Double transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getAmountPaidDate() {
		return amountPaidDate;
	}

	public void setAmountPaidDate(String amountPaidDate) {
		this.amountPaidDate = amountPaidDate;
	}
	
	

}
