import { Component } from '@angular/core';
import { Product } from '../../model/product';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { ProductServiceService } from '../product-service.service';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrl: './product-edit.component.css'
})
export class ProductEditComponent {
  productForm: Product = new Product();
  constructor(private proService: ProductServiceService,
    private route: ActivatedRoute,
    private router:Router,) {}

    ngOnInit(): void {
      this.route.paramMap.subscribe((param) => {
        //editt:101 = @Path Varaible
        var id = Number(param.get('id')); // Read the product id from route
        this.getById(id);
        
      });
    }
  
    getById(id: number) {
      this.proService.getById(id).subscribe((data) => {
      console.log(data);
        this.productForm = data;
      });
    }
    
update() {
    this.proService.update(this.productForm)
    .subscribe({
      next:(data) => {
        this.router.navigate(["/Products"]);
      },
      error:(err) => {
        console.log(err);
      }
    })
  }

}
