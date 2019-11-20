import { Component, OnInit, OnDestroy } from '@angular/core';
import { SharedService } from 'app/shared/shared.service';
import { RouterModule, Router } from '@angular/router';
import { LoanDisbursmentDetails } from 'app/model/LoanDisbursmentDetails.model';
import { LoanDisbursmentMaster } from 'app/model/LoanDisbursmentMaster.model';
import { formatDate } from '@angular/common';
import { stringify } from 'querystring';
import { flush } from '@angular/core/testing';
import { LoanMasterDetails } from 'app/model/LoanMasterDetails.model';

@Component({
  selector: 'app-ahdashboard',
  templateUrl: './ahdashboard.component.html',
  styleUrls: ['./ahdashboard.component.scss'],
})
export class AhdashboardComponent implements OnInit , OnDestroy{

  islmDetails:boolean=true;
isview:boolean=false;
isupdate:boolean=false;
  isHide=false;
  isFormHide=false;
  

  constructor(private shared:SharedService, private router:Router ) { }
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
  
  lmDetails:LoanMasterDetails[];
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
  lddid:number;
  lddcaseNumber:string;
  lddMasterDetailsId:any;
  lddloanAmount:number;
  ldddisbursementBy:string;
  ldddisbursementDate:string;
  lddpaidToDelearAmount:any;
  date1:any;
// Varibles 
pendingAmount:number;
updatedAmount:number;
ldddumyid:any;
AcountHead:any='ah';
date2:any;
paidToDelearAmount:any;
  


  ngOnInit() {

    var date=
    this.shared.getDataOfMaster().subscribe((data:LoanMasterDetails[])=>{this.lmDetails=data;
      sessionStorage.setItem('data',JSON.stringify(this.lmd))});
      this.lmd=JSON.parse(sessionStorage.getItem('data'));
    
  }
  
  viewData(lmd:LoanMasterDetails) {
    this.islmDetails=false;
    this.isview=true;
    this.isupdate=false;
    this. isHide=false;
      this.isFormHide=false;
    this.shared.viewData(lmd).subscribe((data:LoanMasterDetails)=>{
      this.shared.lmd=data;
    })
}
closeView(){
  this.islmDetails=true;
  this.isview=false;
  this.isupdate=false;
  this. isHide=false;
      this.isFormHide=false;
 }

 update(lmd:LoanMasterDetails){
  this.islmDetails=false;
  this.isview=false;
  this.isupdate=true;
  this. isHide=false;
  this.isFormHide=false;
    this.shared.viewData(lmd).subscribe((data:LoanMasterDetails)=>{
      this.shared.lmd=data;
    })
    this.paidToDelearAmount=this.shared.lmd.paidToDelear;
    this.ldd.paidToDelear=this.paidToDelearAmount;
    
  alert('in update ')
 }

 submitUpdatedData(pendingAmount)
 {
  this.islmDetails=true;
  this.isview=false;
  this.isupdate=false;
  this. isHide=false;
  this.isFormHide=false;
  this.updatedAmount=this.shared.lmd.paidToDelear-pendingAmount;
  this.shared.lmd.paidToDelear=this.updatedAmount;

 }

 processForDisbursment(lmd:LoanMasterDetails)
 {
  this.islmDetails=false;
  this.isview=false;
  this.isupdate=false;
  this. isHide=true;
  this.isFormHide=false;
  alert(lmd.loanAmount)
  this.shared.viewData(lmd).subscribe((data:LoanMasterDetails)=>{
    this.shared.lmd=data;
  })
 this.ldddumyid=lmd.loanMasterDetailsId;
 this.ldd.loanMasterDetailsId=this.ldddumyid;
// need to write autoge
 //this.ldd.caseNumber=
var date=new Date();
this.date2=date;
this.ldd.vehicleDetailsId=this.shared.lmd.vehicleDetailsId;
this.ldd.advanceEmi=this.shared.lmd.advanceEmi;
this.ldd.paidToDelear=this.shared.lmd.paidToDelear;
 this.ldd.tenure=lmd.tenure;
 this.ldd.loanAmount=lmd.loanAmount;
 this.ldd.emi=lmd.emi;
 this.ldd.actualEmi=lmd.actualEmi;
 this.ldd.advanceEmi=lmd.advanceEmi;
 this.ldd.paidToDelear=lmd.paidToDelear;
 this.ldd.disbursementBy=this.AcountHead;
 this.ldd.disbursementDate=this.date2;

 this.shared.processForDisbursment(this.ldd).subscribe((data:LoanDisbursmentDetails)=>{
  this.shared.ldd=data;
});

this.ngOnDestroy();
this.shared.getData().subscribe((data:LoanDisbursmentDetails[])=>{
  this.lddetails=data;
  console.log(this.lddetail);
  sessionStorage.setItem('data',JSON.stringify(this.lddetail));
  this.lddetail=JSON.parse(sessionStorage.getItem('data'));
  
 } );

 }


  // need to map with other code

  processForDisbursmentPayment(lddetail:LoanDisbursmentDetails)
  {
   
    this.islmDetails=false;
    this.isview=false;
    this.isupdate=false;
    this. isHide=false;
    this.isFormHide=true;
    
    this.shared.getFetchData(lddetail).subscribe((data:LoanDisbursmentDetails)=>{
      this.lddetail=data;
      sessionStorage.setItem('singleData',JSON.stringify(this.lddetail));
      
         this.lddetail=JSON.parse(sessionStorage.getItem('singleData'));
         this.lddcaseNumber=this.lddetail.caseNumber;
         this.lddloanAmount=this.lddetail.loanAmount;
         this.lddpaidToDelearAmount=this.lddetail.paidToDelear;


         this.lddid=this.lddetail.loanDisbursmentId;
         this.lddMasterDetailsId=this.lddetail.loanMasterDetailsId;
         this.ldddisbursementBy=this.lddetail.disbursementBy;
         this.ldddisbursementDate=this.lddetail.disbursementDate;
        
    });
    }
    

    SubmitLoanDisbursment(ldmaster:LoanDisbursmentMaster)
    {
      this.islmDetails=true;
    this.isview=false;
    this.isupdate=false;
      this.isHide=false;
      this.isFormHide=false;
      var date = new Date();
      this.date1=date;
      this.ldmaster.amountPaidDate=this.date1;
      this.ldmaster.caseNumber=this.lddcaseNumber;
      this.ldmaster.totalAmount=this.lddloanAmount;
      this.ldmaster.transferAmount=this.lddpaidToDelearAmount
      this.shared.ldmSaveData(ldmaster).subscribe((data:LoanDisbursmentMaster)=>{
        this.ldmaster=data;
        sessionStorage.setItem('saveData',JSON.stringify(this.ldmaster));
       this.ldmaster=JSON.parse(sessionStorage.getItem('saveData'));
        this.ngOnDestroy();
        
      }
      );
    }
    ngOnDestroy()
    {
      

    }
  }

  
 