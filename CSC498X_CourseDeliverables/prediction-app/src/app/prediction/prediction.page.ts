import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ApisService } from '../apis/apis.service';

@Component({
  selector: 'app-prediction',
  templateUrl: './prediction.page.html',
  styleUrls: ['./prediction.page.scss'],
})
export class PredictionPage implements OnInit {

  public name: string = '';
  public gender : string = '';
  public nationality : string = '';
  public age :  string = '';

  constructor(private apiService:ApisService, private route: ActivatedRoute, private router : Router) { }

  ngOnInit() {
    this.route.queryParams.subscribe(params => {
      this.name = JSON.parse(params['name']);
    });

    this.apiService.getGender(this.name).subscribe((response: any) => {
      this.gender = response.gender;
    });

    this.apiService.getNationality(this.name).subscribe((response: any) => {
      const display : any[] = []; 
      let disp : any = "";
      for (let countryobj in response.country) {
        display.push(response.country[countryobj].country_id);
      }
      disp = display.join(", ");

      this.nationality = disp;

    });

    this.apiService.getAge(this.name).subscribe((response: any) => {
      this.age = response.age;
    });
  }



  

}
