import { Component } from '@angular/core';
import { ProductServiceService } from '../product-service.service';
import { Product } from '../../model/product';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrl: './product-form.component.css'
})
export class ProductFormComponent {
  constructor(private productService:ProductServiceService,
    private router:Router) {}
  // productForm: Product = {
  //   id: 0,
  //   pname: '',
  //   price: 0
  // };
  productForm: Product = new Product();
 
  create(){
    this.productService.createProduct(this.productForm)
    .subscribe({
      next:(data) => {
        this.router.navigate(["/Products"])
      },
      error:(err) => {
        console.log(err);
      }
    })
  }
}
