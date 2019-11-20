import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app.routing';
import { ComponentsModule } from './components/components.module';
import { AppComponent } from './app.component';
import {
  AgmCoreModule
} from '@agm/core';
import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { LoginComponent } from './components/Login/login.component';
import { AhModule } from './Modules/ah/ah.module';
import { CmModule } from './Modules/cm/cm.module';
import { BmModule } from './Modules/bm/bm.module';
import { AcModule } from './Modules/ac/ac.module';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  imports: [
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    HttpClientModule,
    ComponentsModule,
    RouterModule,
    AppRoutingModule,
    AgmCoreModule.forRoot({
      apiKey: 'YOUR_GOOGLE_MAPS_API_KEY'
    }),
    AhModule,
    CmModule,
    BmModule,
    AcModule
  ],
  declarations: [
    AppComponent,
    AdminLayoutComponent,
LoginComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
