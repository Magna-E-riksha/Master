package com.crts.app.magna.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.magna.main.model.LoanDisbursmentDetails;
import com.crts.app.magna.main.serviceInter.ServiceInter;

@RestController
public class Controller {
	@Autowired 
	ServiceInter service;
	@RequestMapping("/test")
	public String test()
	{
		return "its Working !!!!";
	}

	@RequestMapping(value = "/getAllData" , method = RequestMethod.GET, produces = "application/json")
	public List<LoanDisbursmentDetails> showData()
	{
		List<LoanDisbursmentDetails> list=service.getAllData();
		System.out.println(list);
		return list;
	}
}
