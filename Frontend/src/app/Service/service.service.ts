import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Cliente } from '../Modelo/Cliente';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/api/v1'

  getClientes(){
    return this.http.get(this.Url+ '/all')
  }

  createCliente(cliente: Cliente){
    return this.http.post<Cliente>(this.Url+ '/nuevo', cliente)
  }
  
}
