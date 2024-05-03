import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';

@Injectable({
  providedIn: 'root'
})
export class GrzybService {
  private baseUrl = 'http://localhost:8082/api';

  constructor(private http: HttpClient) { }

  getAllGrzyby(): Observable<any> {
    return this.http.get(`${this.baseUrl}/get`);
  }
  getJadalneGrzyby(): Observable<any> {
    return this.http.get(`${this.baseUrl}/get/jadalne`);
  }
  getNieJadalneGrzyby(): Observable<any> {
    return this.http.get(`${this.baseUrl}/get/nieJadalne`);
  }
  deleteGrzyb(name: string): Observable<any> {
    return this.http.delete(`${this.baseUrl}/delete/${name}`);
  }
  getGrzyb(name: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/get/${name}`);
  }
}
