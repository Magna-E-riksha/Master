package com.crts.app.magna.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crts.app.magna.main.dto.DTOLoanDisbursmentDetailsAllFields;
import com.crts.app.magna.main.model.LoanDisbursmentDetails;

@Repository
public interface LoanDisbursmentDetailsRepository extends JpaRepository<LoanDisbursmentDetails, Integer> {
	
	@Query("select new com.crts.app.magna.main.dto.DTOLoanDisbursmentDetailsAllFields(lda.loanDisbursmentId,lda.loanMasterDetailsId,lda.caseNumber,lda.vehicleDetailsId,lda.paidToDelearAmount,lda.loanAmount,lda.tenure,lda.emi,lda.advanceEmi,lda.actualEmi,lda.disbursementBy,lda.disbursementDate) from LoanDisbursmentDetails lda")
	public List<DTOLoanDisbursmentDetailsAllFields> fetchAllDataldd();
	
	@Query("select new com.crts.app.magna.main.dto.DTOLoanDisbursmentDetailsAllFields(lda.loanDisbursmentId,lda.loanMasterDetailsId,lda.caseNumber,lda.vehicleDetailsId,lda.paidToDelearAmount,lda.loanAmount,lda.tenure,lda.emi,lda.advanceEmi,lda.actualEmi,lda.disbursementBy,lda.disbursementDate) from LoanDisbursmentDetails lda where lda.loanDisbursmentId=:loanDisbursmentId")
	public DTOLoanDisbursmentDetailsAllFields getUserData(int loanDisbursmentId);
}
