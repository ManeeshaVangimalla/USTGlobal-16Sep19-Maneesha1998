import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  baseURL = 'http://localhost:8080/stockmanagement';
  header = new HttpHeaders({ 'content-type': 'application/json' });
  constructor(private http: HttpClient) { }
}
