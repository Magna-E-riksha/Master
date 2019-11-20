import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AcdashboardComponent } from './acdashboard/acdashboard.component';
import { Routes, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
const acrouting:Routes=[{path:'acdash', component:AcdashboardComponent}]
@NgModule({
  declarations: [AcdashboardComponent],
  imports: [
    CommonModule, RouterModule.forChild(acrouting),FormsModule
  ],
  exports:[AcdashboardComponent]
})
export class AcModule { }
