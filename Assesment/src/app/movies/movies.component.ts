import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  Movies = [
    {
      name: 'Joker',
      imgUrl: 'https://cdn.pixabay.com/photo/2017/08/28/00/01/thejoker-2688077__340.jpg'
    },
    {
      name1: 'Animal',
      imgUrl1: 'https://cdn.pixabay.com/photo/2015/01/12/03/14/movie-597004__340.jpg'
    },
    {
      name2:'Three friends',
      imgUrl2:'https://cdn.pixabay.com/photo/2012/10/25/23/24/film-poster-62856__340.jpg'
    }
  ]

  
    

    
  

  constructor() { }

  ngOnInit() {
  }


}
