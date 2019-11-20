import { NgModule } from '@angular/core';
import { CommonModule, } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';
import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { OEModule } from './Modules/oe/oe.module';
import { LoginComponent } from './components/Login/login.component';
import { REModule } from './Modules/re/re.module';
import { OHModule } from './Modules/oh/oh.module';
import { AhModule } from './Modules/ah/ah.module';
import { CmModule } from './Modules/cm/cm.module';
import { BmModule } from './Modules/bm/bm.module';
import { AcModule } from './Modules/ac/ac.module';

const routes: Routes = [
  {
    path: '',
    component: LoginComponent
    // redirectTo: 'role/admin/dashboard',
    //  pathMatch: 'full',
  },
  {
    path: 'role',
    component: AdminLayoutComponent,
    children: [
      { path: 'oe', loadChildren: () => OEModule },
      { path: 're', loadChildren: () => REModule },
      { path: 'oh', loadChildren: () => OHModule },
      { path: 'ah', loadChildren: () => AhModule },
      { path: 'cm', loadChildren: () => CmModule },
      { path: 'bm', loadChildren: () => BmModule },
      { path: 'ac', loadChildren: () => AcModule }
    ]
  }
];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes, {
      useHash: true
    })
  ],
  exports: [
  ],
})
export class AppRoutingModule { }
