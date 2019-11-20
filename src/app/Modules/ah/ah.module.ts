import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AhdashboardComponent } from './ahdashboard/ahdashboard.component';
import { Routes, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material';

const ahrouting:Routes=[{path:'ahdash', component:AhdashboardComponent}]
@NgModule({
  declarations: [AhdashboardComponent],
  imports: [
    CommonModule, RouterModule.forChild(ahrouting), FormsModule,MatFormFieldModule
  ],
exports:[AhdashboardComponent]
})
export class AhModule { }
