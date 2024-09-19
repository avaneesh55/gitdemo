import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LoginComponent } from './login/login.component';
import { ProductComponent } from './product/product.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
//import { ProductServiceService } from './product-service.service';
import { HomeComponent } from './home/home.component';
import { ProductFormComponent } from './product-form/product-form.component';
import { ProductEditComponent } from './product-edit/product-edit.component';
//import { ProductFormComponent } from './product-form/product-form.component';

@NgModule({
  declarations: [
    HomeComponent,
    AppComponent,
    NavbarComponent,
    LoginComponent,
    ProductComponent,
    ProductFormComponent,
    ProductEditComponent,
    //ProductFormComponent,
  
  ],
  imports: [
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserModule,
    AppRoutingModule
  ],
  //providers: [ProductServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
