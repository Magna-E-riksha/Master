package com.crts.app.magna.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/test")
	public String test()
	{
		return "i am fine how are you";
	}

}
