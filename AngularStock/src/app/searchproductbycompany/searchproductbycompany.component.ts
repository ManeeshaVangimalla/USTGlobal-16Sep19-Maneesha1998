import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-searchproductbycompany',
  templateUrl: './searchproductbycompany.component.html',
  styleUrls: ['./searchproductbycompany.component.css']
})
export class SearchproductbycompanyComponent implements OnInit {

  constructor(private http: HttpClient, private add: AuthService, private router: Router) { }
  serchProductByCompany(searchProductByCompanyForm: NgForm) {
    this.http.post(`${this.add.baseURL}/searchproductbycompany`, searchProductByCompanyForm.value).subscribe(response => {
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
