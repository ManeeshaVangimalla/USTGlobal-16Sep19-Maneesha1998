import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updateproduct',
  templateUrl: './updateproduct.component.html',
  styleUrls: ['./updateproduct.component.css']
})
export class UpdateproductComponent implements OnInit {

  constructor(private http: HttpClient, private add: AuthService, private router: Router) { }
  updateProduct(updateProductForm: NgForm) {
    this.http.post(`${this.add.baseURL}/updateproduct`, updateProductForm.value).subscribe(response => {
    if (response != null) {
      alert('product updated successfuly');
    } else {
      alert('Failed to update product');
    }
    });
  }

  ngOnInit() {
  }

}
