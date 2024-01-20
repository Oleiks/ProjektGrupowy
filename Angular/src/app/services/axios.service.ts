import { Injectable } from '@angular/core';
import axios from 'axios';

@Injectable({
  providedIn: 'root'
})
export class AxiosService {

  constructor() {
    axios.defaults.baseURL = "http://localhost:8082" // backend URL, set to gateway
    axios.defaults.headers.post["Content-Type"] = "application/json"
  }

  request(method: string, url: string, data: any): Promise<any> {
    return axios({
      method: method,
      url: url,
      data: data
    });
  }
}
