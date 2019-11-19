package com.crts.app.magna.main.dto;

public class DTOLoanDisbursmentDetailsAllFields {
	
	private int loanDisbursmentId;
	private int loanMasterDetailsId;
	private String caseNumber;
	private String vehicleDetailsId;
	private Double paidToDelearAmount;
	private Double loanAmount;
	private int tenure;
	private Double emi;
	private Double advanceEmi;
	private Double actualEmi;
	private String disbursementBy;
	private String disbursementDate;
	
	public DTOLoanDisbursmentDetailsAllFields() {
		// TODO Auto-generated constructor stub
	}

	public DTOLoanDisbursmentDetailsAllFields(int loanDisbursmentId, int loanMasterDetailsId, String caseNumber,
			String vehicleDetailsId, Double paidToDelearAmount, Double loanAmount, int tenure, Double emi,
			Double advanceEmi, Double actualEmi, String disbursementBy, String disbursementDate) {
		super();
		this.loanDisbursmentId = loanDisbursmentId;
		this.loanMasterDetailsId = loanMasterDetailsId;
		this.caseNumber = caseNumber;
		this.vehicleDetailsId = vehicleDetailsId;
		this.paidToDelearAmount = paidToDelearAmount;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.emi = emi;
		this.advanceEmi = advanceEmi;
		this.actualEmi = actualEmi;
		this.disbursementBy = disbursementBy;
		this.disbursementDate = disbursementDate;
	}

	public int getLoanDisbursmentId() {
		return loanDisbursmentId;
	}

	public void setLoanDisbursmentId(int loanDisbursmentId) {
		this.loanDisbursmentId = loanDisbursmentId;
	}

	public int getLoanMasterDetailsId() {
		return loanMasterDetailsId;
	}

	public void setLoanMasterDetailsId(int loanMasterDetailsId) {
		this.loanMasterDetailsId = loanMasterDetailsId;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getVehicleDetailsId() {
		return vehicleDetailsId;
	}

	public void setVehicleDetailsId(String vehicleDetailsId) {
		this.vehicleDetailsId = vehicleDetailsId;
	}

	public Double getPaidToDelearAmount() {
		return paidToDelearAmount;
	}

	public void setPaidToDelearAmount(Double paidToDelearAmount) {
		this.paidToDelearAmount = paidToDelearAmount;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
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

	public Double getActualEmi() {
		return actualEmi;
	}

	public void setActualEmi(Double actualEmi) {
		this.actualEmi = actualEmi;
	}

	public String getDisbursementBy() {
		return disbursementBy;
	}

	public void setDisbursementBy(String disbursementBy) {
		this.disbursementBy = disbursementBy;
	}

	public String getDisbursementDate() {
		return disbursementDate;
	}

	public void setDisbursementDate(String disbursementDate) {
		this.disbursementDate = disbursementDate;
	}
	
	
}

