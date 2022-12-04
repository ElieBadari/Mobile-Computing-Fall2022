import { Component } from '@angular/core';
import { NavigationExtras, Route, Router } from '@angular/router';
import { ApisService } from '../apis/apis.service';
import { PredictionPage } from '../prediction/prediction.page';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  public image : string = '';
  public name :  string = '';
  
 
  constructor(private apiService:ApisService, public router: Router) {}

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
    predictMe(){
      let navigationExtras: NavigationExtras = {
        queryParams: {
          name: JSON.stringify(this.name)
        }
      };
      
    this.router.navigate(['prediction'], navigationExtras);
  }
}


