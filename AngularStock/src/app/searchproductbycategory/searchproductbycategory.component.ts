import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-searchproductbycategory',
  templateUrl: './searchproductbycategory.component.html',
  styleUrls: ['./searchproductbycategory.component.css']
})
export class SearchproductbycategoryComponent implements OnInit {

  constructor(private http: HttpClient, private add: AuthService, private router: Router) { }
  serchProductByCategory(searchProductByCategoryForm: NgForm) {
    this.http.post(`${this.add.baseURL}/searchproductbycategory`, searchProductByCategoryForm.value).subscribe(response => {
    if (response != null) {
      alert('product got successfuly');
      this.router.navigate(['/login']);
    } else {
      alert('Failed to get product');
    }
    });
  }


  ngOnInit() {
  }

}
