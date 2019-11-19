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
	private String vehicleDetailsId;
	public String getVehicleDetailsId() {
		return vehicleDetailsId;
	}

	public void setVehicleDetailsId(String vehicleDetailsId) {
		this.vehicleDetailsId = vehicleDetailsId;
	}

	private String customerId;
	private int tenure;
	private Double loanAmount;
	
	@Column(name = "roi")
	private Double rateOfInterest;
	
	private Double emi;
	
	private Double actualEmi; 
	
	private String secondYearInsurance;
	
	private Double advanceEmi;
	
	private Double processingFees;
	
	private Double paidToDelear;
	
	private Double paidToMf;
	
	private String verifiedByCm;
	
	private String createdBy;
	
	private String createdDate;
	
	private String sanctionLetterGeneratinDate;
	
	private String documentUpload;
	
	private String documentRecievedDate;

	public int getLoanMasterDetailsId() {
		return loanMasterDetailsId;
	}

	public void setLoanMasterDetailsId(int loanMasterDetailsId) {
		this.loanMasterDetailsId = loanMasterDetailsId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}

	public Double getActualEmi() {
		return actualEmi;
	}

	public void setActualEmi(Double actualEmi) {
		this.actualEmi = actualEmi;
	}

	public String getSecondYearInsurance() {
		return secondYearInsurance;
	}

	public void setSecondYearInsurance(String secondYearInsurance) {
		this.secondYearInsurance = secondYearInsurance;
	}

	public Double getAdvanceEmi() {
		return advanceEmi;
	}

	public void setAdvanceEmi(Double advanceEmi) {
		this.advanceEmi = advanceEmi;
	}

	public Double getProcessingFees() {
		return processingFees;
	}

	public void setProcessingFees(Double processingFees) {
		this.processingFees = processingFees;
	}

	public Double getPaidToDelear() {
		return paidToDelear;
	}

	public void setPaidToDelear(Double paidToDelear) {
		this.paidToDelear = paidToDelear;
	}

	public Double getPaidToMf() {
		return paidToMf;
	}

	public void setPaidToMf(Double paidToMf) {
		this.paidToMf = paidToMf;
	}

	public String getVerifiedByCm() {
		return verifiedByCm;
	}

	public void setVerifiedByCm(String verifiedByCm) {
		this.verifiedByCm = verifiedByCm;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getSanctionLetterGeneratinDate() {
		return sanctionLetterGeneratinDate;
	}

	public void setSanctionLetterGeneratinDate(String sanctionLetterGeneratinDate) {
		this.sanctionLetterGeneratinDate = sanctionLetterGeneratinDate;
	}

	public String getDocumentUpload() {
		return documentUpload;
	}

	public void setDocumentUpload(String documentUpload) {
		this.documentUpload = documentUpload;
	}

	public String getDocumentRecievedDate() {
		return documentRecievedDate;
	}

	public void setDocumentRecievedDate(String documentRecievedDate) {
		this.documentRecievedDate = documentRecievedDate;
	}
	
	

}
