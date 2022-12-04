import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ApisService } from '../apis/apis.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  image : string = '';
 
  constructor(private apiService:ApisService, private router:Router) {}

    ngOnInit(){ 
      this.apiService.getImage().subscribe((response: any) => {
        this.image = response.message;
    });

  }
    anodaOne(){
      this.apiService.getImage().subscribe((response: any) => {
        this.image = response.message;

    });
  }
}


