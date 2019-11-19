package com.crts.app.magna.main.serviceInter;

import java.util.List;

import com.crts.app.magna.main.dto.DTOLoanDisbursmentDetailsAllFields;
import com.crts.app.magna.main.dto.DTOLoanDisbursmentMasterAllFields;
import com.crts.app.magna.main.model.LoanDisbursmentMaster;

public interface ServiceInter {
	
	public List<DTOLoanDisbursmentDetailsAllFields> getAllData();
	public DTOLoanDisbursmentDetailsAllFields getUserData(int loanDisbursmentId);
	public void registerUser(DTOLoanDisbursmentMasterAllFields ldMaster);
	public List<LoanDisbursmentMaster> getAllDataLDMaster();
	

}
