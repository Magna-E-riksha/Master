import { Component, OnInit, OnDestroy } from '@angular/core';
import { SharedService } from 'app/shared/shared.service';
import { Router } from '@angular/router';
import { LoanDisbursmentDetails } from 'app/model/LoanDisbursmentDetails.model';
import { EMIPayment } from 'app/model/EMIPadyment.model';
import { LedgerDetails } from 'app/model/LedgerDetails.model';
import { LedgerUpdationDetails } from 'app/model/LedgerUpdationDetails.model';

@Component({
  selector: 'app-acdashboard',
  templateUrl: './acdashboard.component.html',
  styleUrls: ['./acdashboard.component.scss']
})
export class AcdashboardComponent implements OnInit, OnDestroy {

  constructor(private shared:SharedService, router:Router) { }
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
 dumyCaseNumber:string;
  emiAmount:number;
  emiLastDate:string;
  emiPiadAmount:number;
  emiPaidDate:string;
  isDisabled=true;
  ledgerDetailsId1:any;
  date1:any;
 
  ngOnInit() {
    
    
  }
  checkCaseNumber(dumyCaseNumber)
  {
  
alert(dumyCaseNumber);
    this.shared.getLDetails(dumyCaseNumber).subscribe((data:LedgerDetails)=>{
      this.lDetails=data;
      this.emiAmount=this.lDetails.emi;
      alert(this.emiAmount)
      this.emiLastDate=this.lDetails.emiStartDate;
      this.emiPiadAmount

    });
  }
  SubmitEmi(dumyCaseNumber,emiAmount,emiLastDate,emiPiadAmount)
  {
    
    var date=new Date();
    this.ledgerDetailsId1=this.lDetails.ledgerDetailsId; 
    this.lUDetails.ledgerDetailsId=this.ledgerDetailsId1;
    this.lUDetails.caseNumber=dumyCaseNumber;
    this.date1=date;
    this.lUDetails.emiPaidDate=this.date1;
    this.lUDetails.emiPaidAmount=emiPiadAmount;
    
    alert('start ')
    alert(this.lUDetails.caseNumber)
    alert(emiPiadAmount)
    alert(this.lUDetails.emiPaidDate)
    alert(this.lUDetails.emiPaidAmount)
    alert(this.lUDetails.totalEmiPaid)
    alert('end')

    this.shared.ledgerUpadationDetail(this.lUDetails).subscribe((data:LedgerUpdationDetails)=>{
      this.lUDetails=data;
      this.ngOnDestroy();

    })
  
  }
  ngOnDestroy()
  {
    
    this.emiAmount;
  this.emiLastDate
  this.emiPiadAmount
  this.emiPaidDate
  this.isDisabled
  this.ledgerDetailsId1
  this.date1
  this.emiPayment
  this.ledgerDetails
  this.ladgerUpdation
  }

}
