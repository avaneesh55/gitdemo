import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  constructor(private http:HttpClient) {


   }
   getUserData(){
    let apiurl="http://localhost:9191/api/products";
    return this.http.get(apiurl);
  }
  createProduct(data:any)
  {
    //return this.http.post<any>(" http://localhost:3000/products",data)
    return this.http.post<any>(" http://localhost:9191/api/products",data)
    .pipe(map((res:any)=>{
      console.log(res);
      return res;
    }));
  }
  //------------------Update----------------
  getById(id: number) {
    //return this.http.get<Product>(`http://localhost:3000/products/${id}`);
    console.log('');
    return this.http.get<Product>(`http://localhost:9191/api/products/${id}`);
   }
   update(payload:Product){
    //return this.http.put(`http://localhost:3000/products/${payload.id}`,payload);
    return this.http.put(`http://localhost:9191/api/products/${payload.id}`,payload);
   
   }
}

