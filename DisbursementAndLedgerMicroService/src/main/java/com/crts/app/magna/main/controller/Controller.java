package com.crts.app.magna.main.controller;

import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.crts.app.magna.main.model.LoanDisbursmentMaster;
import com.crts.app.magna.main.serviceInter.ServiceInter;
import com.crts.app.magna.main.Utility.ExcelGenerator;
import com.crts.app.magna.main.dto.DTOLoanDisbursmentDetailsAllFields;
import com.crts.app.magna.main.dto.DTOLoanDisbursmentMasterAllFields;

@CrossOrigin("*")
@RestController
public class Controller {
	
	@Autowired 
	ServiceInter service;
	 @Autowired
	 private JavaMailSender sender;
		
	@RequestMapping("/test")
	public String test()
	{
		return "its Working !!!!";
	}

	@RequestMapping(value = "/getAllData" , method = RequestMethod.GET, produces = "application/json")
	public List<DTOLoanDisbursmentDetailsAllFields> showData()
	{
		return service.getAllData();
	}
	
	@RequestMapping(value = "/getSingleData/{loanDisbursmentId}", method = RequestMethod.GET, produces = "application/json")
	public DTOLoanDisbursmentDetailsAllFields getData(@PathVariable int loanDisbursmentId)
	{
		return service.getUserData(loanDisbursmentId);
	}
	
	@RequestMapping(value = "/saveData",method = RequestMethod.POST)
	public String registerCustomer(@RequestBody DTOLoanDisbursmentMasterAllFields ldMaster)
	{
		service.registerUser(ldMaster);
		return "Loan Disbursment Master Details saved successfully!!!!";
	}
	
//	 method to schedule event execution 
	@Scheduled(cron = "0 0/30 16 * * *")
	public void scheduleTaskWithFixedRate() throws IOException {
//		method to get url open in browser
//		applicationReadyEvent();
//		method to send mail 
//		sendMailto();
		System.out.println("Report Generted Please Check!!!!!!!!!!!!!!!");
		
	}

//	method will generate excel from database
	@RequestMapping(value = "/downloadExcelReport", method = RequestMethod.GET)
    public ResponseEntity<InputStreamResource> excelCustomersReport() throws IOException {
    List<LoanDisbursmentMaster> customers = (List<LoanDisbursmentMaster>) service.getAllDataLDMaster();
    ByteArrayInputStream in = ExcelGenerator.customersToExcel(customers);
    // return IOUtils.toByteArray(in);
    HttpHeaders headers = new HttpHeaders();
     headers.add("Content-Disposition", "attachment; filename=customers.xlsx");
	    
     return ResponseEntity.ok()
                  .headers(headers)
                  .body(new InputStreamResource(in));
    }
//	method to get url open in browser automatically
//    @EventListener({ApplicationReadyEvent.class})
//    void applicationReadyEvent() {
//        System.out.println("Application started ... launching browser now");
//        browse("http://localhost:8081/downloadExcelReport");
//    }
    public static void browse(String url) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
   public String sendMailto() 
	{
	String email="nileshpawar017@gmail.com";
	try {
		System.out.println("mail send please check mail box!!!!!");
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setTo(email);
		helper.setText("PFA!!!");
		helper.setSubject("please find todays DPR");
		FileSystemResource file=new FileSystemResource("C://Users//Priyanka Chavan//Downloads/customers.xlsx");
		helper.addAttachment(file.getFilename(), file);
		sender.send(message);
		return "Email Sent!";
		}
		catch (Exception ex) 
		{
		return "Error in sending email: " + ex;
		}
    }
	
}
