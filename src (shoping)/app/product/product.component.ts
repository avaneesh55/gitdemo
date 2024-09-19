import { Component } from '@angular/core';
import { ProductServiceService } from '../product-service.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {
  productList: any;
  constructor(private products: ProductServiceService){
    this.products.getUserData().subscribe(data => {
      console.log(data);
      this.productList = data;
    })
  }
}
