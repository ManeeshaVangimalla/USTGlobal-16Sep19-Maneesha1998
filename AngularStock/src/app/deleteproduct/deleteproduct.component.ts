import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-deleteproduct',
  templateUrl: './deleteproduct.component.html',
  styleUrls: ['./deleteproduct.component.css']
})
export class DeleteproductComponent implements OnInit {
  
  constructor(private http: HttpClient, private add: AuthService, private router: Router) { }
  deleteProduct(deleteProductForm: NgForm) {
    this.http.post(`${this.add.baseURL}/deleteproduct/{id}`, deleteProductForm.value).subscribe(response => {
    if (response != null) {
      alert('product deleted successfuly');
      this.router.navigate(['/login']);
    } else {
      alert('Failed to delete product');
    }
    });
  }

  ngOnInit() {
  }

}
