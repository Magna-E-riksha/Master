import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { Routes, RouterModule } from '@angular/router';
import { OhdashboardComponent } from './ohdashboard/ohdashboard.component';

const ohrouting:Routes=[
  { path: 'ohdash', component: OhdashboardComponent }
]
@NgModule({
  declarations: [OhdashboardComponent],
  imports: [
    CommonModule, RouterModule.forChild(ohrouting)
  ],
  exports:[OhdashboardComponent]
})
export class OHModule { }
