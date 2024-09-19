import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs';

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
}
