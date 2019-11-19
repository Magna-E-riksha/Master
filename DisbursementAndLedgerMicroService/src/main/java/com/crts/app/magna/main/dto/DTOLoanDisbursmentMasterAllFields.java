package com.crts.app.magna.main.dto;


public class DTOLoanDisbursmentMasterAllFields {
	
	private int loanDisbursementMasterId;
	private String caseNumber;
	private String amountPayType;
	private Double totalAmount;
	private Long mangaFinanceaccountNumber;
	private String bankName;
	private String magnaFinanceIFSCCode;
	private String accountType;
	private Double transferAmount;
	private String paymentStatus;
	private String amountPaidDate;
	
public DTOLoanDisbursmentMasterAllFields() {
	// TODO Auto-generated constructor stub
}

public DTOLoanDisbursmentMasterAllFields(int loanDisbursementMasterId, String caseNumber, String amountPayType,
		Double totalAmount, Long mangaFinanceaccountNumber, String bankName, String magnaFinanceIFSCCode,
		String accountType, Double transferAmount, String paymentStatus, String amountPaidDate) {
	super();
	this.loanDisbursementMasterId = loanDisbursementMasterId;
	this.caseNumber = caseNumber;
	this.amountPayType = amountPayType;
	this.totalAmount = totalAmount;
	this.mangaFinanceaccountNumber = mangaFinanceaccountNumber;
	this.bankName = bankName;
	this.magnaFinanceIFSCCode = magnaFinanceIFSCCode;
	this.accountType = accountType;
	this.transferAmount = transferAmount;
	this.paymentStatus = paymentStatus;
	this.amountPaidDate = amountPaidDate;
}

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

public String getBankName() {
	return bankName;
}

public void setBankName(String bankName) {
	this.bankName = bankName;
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
