import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  constructor(private http: HttpClient, private add: AuthService, private router: Router) { }
  addProduct(addProductForm: NgForm) {
    this.http.post(`${this.add.baseURL}/addproduct`, addProductForm.value).subscribe(response => {
    if (response != null) {
      alert('product added successfuly');
      this.router.navigate(['/login']);
    } else {
      alert('Failed to add product');
    }
    });
  }

  ngOnInit() {
  }

}
