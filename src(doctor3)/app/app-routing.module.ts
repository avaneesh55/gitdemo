import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { DocListComponent } from './doc-list/doc-list.component';
import { AddDocComponent } from './add-doc/add-doc.component';
import { PatientComponent } from './patient/patient.component';

const routes: Routes = [
  { path: 'home', component:  HomeComponent},
  { path: 'login', component: LoginComponent },
  { path: 'doctorlist', component: DocListComponent },
  { path: 'adddoctor', component: AddDocComponent },
  { path: 'patient/:docId', component: PatientComponent },  // for passing id

  {path:'', redirectTo:'home',pathMatch:'full'},
  { path: '**', redirectTo:'login',pathMatch:'full'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
