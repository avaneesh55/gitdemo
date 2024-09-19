import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ProductComponent } from './product/product.component';
import { HomeComponent } from './home/home.component';
import { authGuard } from './auth.guard';

const routes: Routes = [
{ path: 'Home', component: HomeComponent },
{path : 'Login', component:LoginComponent},
{path : 'Products', component:ProductComponent, canActivate:[authGuard]},
{path:'', redirectTo:'Products',pathMatch:'full'},
{ path: '**', component:  LoginComponent },



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
