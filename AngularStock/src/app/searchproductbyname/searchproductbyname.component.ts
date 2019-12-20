import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-searchproductbyname',
  templateUrl: './searchproductbyname.component.html',
  styleUrls: ['./searchproductbyname.component.css']
})
export class SearchproductbynameComponent implements OnInit {

  constructor(private http: HttpClient, private add: AuthService, private router: Router) { }
  serchProductByName(searchProductByNameForm: NgForm) {
    this.http.post(`${this.add.baseURL}/searchproductbyname`, searchProductByNameForm.value).subscribe(response => {
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
