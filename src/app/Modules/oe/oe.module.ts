import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OEDashboardComponent } from './oedashboard/oedashboard.component';
import { RouterModule, Routes } from '@angular/router';
const oerouting: Routes = [
  { path: 'oedash', component: OEDashboardComponent }
]


@NgModule({
  declarations: [OEDashboardComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(oerouting)
  ],
  exports: [OEDashboardComponent]
})
export class OEModule { }
