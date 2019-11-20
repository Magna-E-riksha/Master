import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { LoanDisbursmentDetails } from 'app/model/LoanDisbursmentDetails.model';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { LoanDisbursmentMaster } from 'app/model/LoanDisbursmentMaster.model';
import { LoanMasterDetails } from 'app/model/LoanMasterDetails.model';
import { EMIPayment } from 'app/model/EMIPadyment.model';
import { LedgerDetails } from 'app/model/LedgerDetails.model';
import { LedgerUpdationDetails } from 'app/model/LedgerUpdationDetails.model';

@Injectable({
  providedIn: 'root'
})
export class SharedService {

  lddetails:LoanDisbursmentDetails[];
  lddetail:LoanDisbursmentDetails={
    loanDisbursmentId:null,
    loanMasterDetailsId:null,
    caseNumber:'',
    vehicleDetailsId:'',
    paidToDelear:null,
    loanAmount:null,
    tenure:null,
    emi:null,
    advanceEmi:null,
    actualEmi:null,
    disbursementBy:'',
    disbursementDate:''
  }
  lddMasters:LoanDisbursmentMaster[];
  ldmaster:LoanDisbursmentMaster={

    loanDisbursementMasterId:null,
    caseNumber:'',
    amountPayType:'',
    totalAmount:null,
    mangaFinanceaccountNumber:null,
    bankName:'',
    magnaFinanceIFSCCode:'',
    accountType:'',
    transferAmount:null,
    paymentStatus:null,
    amountPaidDate:''
  }
  lmDetails: LoanMasterDetails[];
  lmd:LoanMasterDetails={
    loanMasterDetailsId:null,
    vehicleDetailsId:'',
    customerId:'',
    tenure:null,
    loanAmount:null,
    rateOfInterest:null,
    emi:null,
    actualEmi:null,
    secondYearInsurance:'',
    advanceEmi:null,
    processingFees:null,
    paidToDelear:null,
    paidToMf:null,
    verifiedByCm:'',
    createdBy:'',
    createdDate:'',   
    sanctionLetterGeneratinDate:'',
    documentUpload:'',
    documentRecievedDate:''
    }
    ldDetails1:LoanDisbursmentDetails[];
    ldd:LoanDisbursmentDetails={
    loanDisbursmentId:null,
    loanMasterDetailsId:null,
    caseNumber:'',
    vehicleDetailsId:'',
    
    tenure:null,
    loanAmount:null,
    emi:null,
    actualEmi:null,
    advanceEmi:null,
    paidToDelear:null,
    disbursementBy:'',
    disbursementDate:'',
    }
    emiPayment:EMIPayment[];
    emipay:EMIPayment={
      miPaymentId:null,
      caseNumber:'',
      emiAmount:null,
      emiLastDate:'',
      emiPaidAmount:null,
      emiPaidDate:''
    
    }

    ledgerDetails:LedgerDetails[];
    lDetails:LedgerDetails={
      ledgerDetailsId:null,
    CustomerId:'',
    caseNumber:'',
    loanMasterDetailsId:'',
    totalAmount:null,
    tenure:null,
    emi:null,
    advanceEmi:null,
    emiStartDate:'',
    emiEndDate:'',
    ledgerCreatedDate:'',
    ledgerDetailsEMIPaidAmount:''
    }

    ladgerUpdation:LedgerUpdationDetails[];
    lUDetails:LedgerUpdationDetails={
      ledgerUpdationDetailsId:null,
      ledgerDetailsId:'',
      caseNumber:'',
      emiPaidDate:'',
      emiPaidAmount:null,
      bucket:null,
      totalEmiPaid:null
    }

  constructor(private http:HttpClient, private router:Router) { }

  url:string="http://localhost:8081";
  url1:string="http://localhost:8081/loanRecord";
  url2:string="http://localhost:8081/disBursementData";
  url3:string="http://localhost:8081/getAllLoanData";

  getDataOfMaster():Observable<LoanMasterDetails[]>{
    return this.http.get<LoanMasterDetails[]>(this.url3);
  }
  viewData(lmd:LoanMasterDetails):Observable<LoanMasterDetails>{
  
    return this.http.get<LoanMasterDetails>(this.url1+"/"+lmd.loanMasterDetailsId);
  }
  updateAndSave(ldd:LoanDisbursmentDetails):Observable<LoanDisbursmentDetails>{
    return this.http.get<LoanDisbursmentDetails>(this.url+"/"+ldd.loanDisbursmentId);
  }
  processForDisbursment(ldd:LoanDisbursmentDetails)
  {
    alert('processForDisbursment')
  
  return this.http.post<LoanDisbursmentDetails>(this.url2,ldd);
  }
  
  getData():Observable<LoanDisbursmentDetails[]>
  {
    alert('in shared Services')
    return this.http.get<LoanDisbursmentDetails[]>(this.url+"/getAllData")
  }

  getFetchData(lddetail):Observable<LoanDisbursmentDetails>
  {
    return this.http.get<LoanDisbursmentDetails>(this.url+"/getSingleData/"+lddetail.loanDisbursmentId)
  }

  ldmSaveData(ldmaster:LoanDisbursmentMaster):Observable<LoanDisbursmentMaster>
  {
    return this.http.post<LoanDisbursmentMaster>(this.url+"/saveData/",ldmaster)
  }
  getLDetails(dumyCaseNumber):Observable<LedgerDetails>{
    alert('in shared')
    return this.http.get<LedgerDetails>(this.url+"/getLedgerDetails/"+dumyCaseNumber)
  }
ledgerUpadationDetail(lUDetails:LedgerUpdationDetails):Observable<LedgerUpdationDetails>
{
  alert("in ledgerUpdationDetails")
  alert(lUDetails.emiPaidDate)
  return this.http.post<LedgerUpdationDetails>(this.url+"/updateLedgerUpdationDetails/",lUDetails)
}
}
