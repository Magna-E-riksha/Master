package com.crts.app.magna.main.Utility;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.crts.app.magna.main.model.LoanDisbursmentMaster;

public class ExcelGenerator {
	

	public static ByteArrayInputStream customersToExcel(List<LoanDisbursmentMaster> customers) throws IOException {
	    String[] COLUMNs = {"Loan Disbursement Master Id", "Case Number", "Amount Pay Type", "Total Amount", "Account number", " IFSC ", "Acount Type", "Transfer Amount", "Payment Status", "Amount Paid Date"};
	   System.out.println("in Excel Generator!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	    try( Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream(); )
	    {
	      CreationHelper createHelper = workbook.getCreationHelper();
	   
	      Sheet sheet = workbook.createSheet("Customers");
	     
	      Font headerFont = workbook.createFont();
	     
	      headerFont.setBold(true);
	      headerFont.setColor(IndexedColors.BLUE.getIndex());
	      CellStyle headerCellStyle = workbook.createCellStyle();
	      headerCellStyle.setFont(headerFont);
	      
	      // Row for Header
	      Row headerRow = sheet.createRow(0);
	      // Header
	      for (int col = 0; col < COLUMNs.length; col++)
	      {
	        Cell cell = headerRow.createCell(col);
	        cell.setCellValue(COLUMNs[col]);
	        cell.setCellStyle(headerCellStyle);
	      }
	   
	      // CellStyle for Age
	      CellStyle ageCellStyle = workbook.createCellStyle();
	      ageCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("#"));
		    
	      int rowIdx = 1;
	      for (LoanDisbursmentMaster customer : customers) 
	      {
	        Row row = sheet.createRow(rowIdx++);
	        row.createCell(0).setCellValue(customer.getLoanDisbursementMasterId());
	        row.createCell(1).setCellValue(customer.getCaseNumber());
	        row.createCell(2).setCellValue(customer.getAmountPayType());
	        row.createCell(3).setCellValue(customer.getTotalAmount());
	        row.createCell(4).setCellValue(customer.getMangaFinanceaccountNumber());
	        row.createCell(5).setCellValue(customer.getMagnaFinanceIFSCCode());
	        row.createCell(6).setCellValue(customer.getAccountType());
	        row.createCell(7).setCellValue(customer.getTransferAmount());
	        row.createCell(8).setCellValue(customer.getPaymentStatus());
	        row.createCell(9).setCellValue(customer.getAmountPaidDate());
	   
	        Cell ageCell = row.createCell(3);
	        ageCell.setCellValue(customer.getAccountType());
	        ageCell.setCellStyle(ageCellStyle);
	      }
	      workbook.write(out);
	      return new ByteArrayInputStream(out.toByteArray());
	    }
	  }
	
}
