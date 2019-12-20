import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { DeleteproductComponent } from './deleteproduct/deleteproduct.component';
import { UpdateproductComponent } from './updateproduct/updateproduct.component';
import { SearchproductbynameComponent } from './searchproductbyname/searchproductbyname.component';
import { SearchproductbycategoryComponent } from './searchproductbycategory/searchproductbycategory.component';
import { SearchproductbycompanyComponent } from './searchproductbycompany/searchproductbycompany.component';
import { AddproducttocartComponent } from './addproducttocart/addproducttocart.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddproductComponent,
    DeleteproductComponent,
    UpdateproductComponent,
    SearchproductbynameComponent,
    SearchproductbycategoryComponent,
    SearchproductbycompanyComponent,
    AddproducttocartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'add-product', component: AddproductComponent},
      {path: 'delete-product', component: DeleteproductComponent},
      {path: 'update-product', component: UpdateproductComponent},
      {path: 'searchbyname-product', component: SearchproductbynameComponent},
      {path: 'searchbycategory-product', component: SearchproductbycategoryComponent},
      {path: 'searchbycompany-product', component: SearchproductbycompanyComponent}
 
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
