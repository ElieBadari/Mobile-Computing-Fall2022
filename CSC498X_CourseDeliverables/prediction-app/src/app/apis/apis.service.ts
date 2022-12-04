import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApisService {

  constructor(private http: HttpClient) { }

  getImage(): Observable<any>{
    return this.http.get<any>('https://dog.ceo/api/breeds/image/random');
  }
  getGender(name:string): Observable<any>{
    return this.http.get<any>('https://api.genderize.io?name=' + name);
  }

  getNationality(name:string): Observable<any>{
    return this.http.get<any>('https://api.nationalize.io/?name=' + name);
  }

  getAge(name:string): Observable<any>{
    return this.http.get<any>('https://api.agify.io/?name=' + name);
  }

}
