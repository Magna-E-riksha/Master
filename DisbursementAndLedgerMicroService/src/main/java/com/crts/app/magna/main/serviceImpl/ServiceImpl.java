package com.crts.app.magna.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.magna.main.model.LoanDisbursmentDetails;
import com.crts.app.magna.main.repository.LoanDisbursmentDetailsRepository;
import com.crts.app.magna.main.serviceInter.ServiceInter;

@Service
public class ServiceImpl implements ServiceInter{

	@Autowired 
	LoanDisbursmentDetailsRepository lddr;
	@Override
	public List<LoanDisbursmentDetails> getAllData() {
		
		List<LoanDisbursmentDetails> l		=(List<LoanDisbursmentDetails>) lddr.findAll();
System.out.println(l);
		return l;
				
		}

}
