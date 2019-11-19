package com.crts.app.magna.main.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.magna.main.dto.DTOLoanDisbursmentDetailsAllFields;
import com.crts.app.magna.main.dto.DTOLoanDisbursmentMasterAllFields;
import com.crts.app.magna.main.model.LoanDisbursmentMaster;
import com.crts.app.magna.main.repository.LoanDisbursmentDetailsRepository;
import com.crts.app.magna.main.repository.LoanDisbursmentMasterRepository;
import com.crts.app.magna.main.serviceInter.ServiceInter;

@Service
public class ServiceImpl implements ServiceInter{

	@Autowired 
	LoanDisbursmentDetailsRepository lddr;
	@Autowired
	LoanDisbursmentMasterRepository ldMasterRepository;
	
	@Override
	public List<DTOLoanDisbursmentDetailsAllFields> getAllData() {
		
		return lddr.fetchAllDataldd();
		}
	@Override
	public DTOLoanDisbursmentDetailsAllFields getUserData(int loanDisbursmentId) {
		
		return lddr.getUserData(loanDisbursmentId);
	}
	@Override
	public void registerUser(DTOLoanDisbursmentMasterAllFields ldMaster) {
		ModelMapper modelMapper=new ModelMapper();
		LoanDisbursmentMaster ldMaster1 =modelMapper.map(ldMaster, LoanDisbursmentMaster.class);
		ldMasterRepository.save(ldMaster1);
		
	}
	@Override
	public List<LoanDisbursmentMaster> getAllDataLDMaster() {
		
		return (List<LoanDisbursmentMaster>) ldMasterRepository.findAll();
	}

}
