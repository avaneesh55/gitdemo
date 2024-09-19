import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ProductComponent } from './product/product.component';
import { authGuard } from './auth.guard';
import { ProductFormComponent } from './product-form/product-form.component';

const routes: Routes = [{ path: 'Home', component: HomeComponent },
  { path: 'Login', component: LoginComponent },
  { path: 'Products', component: ProductComponent,canActivate: [authGuard]  },
  
  //{ path: '**', component:  LoginComponent },
  {path:'New',component :ProductFormComponent},
  {path:'', redirectTo:'Products',pathMatch:'full'},
  { path: '**', component:  LoginComponent }

  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }