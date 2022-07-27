import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from 'src/app/Modelo/Cliente';
import { ServiceService } from 'src/app/Service/service.service';
import { map } from 'rxjs';
import { HttpClient } from '@angular/common/http'

@Component({
  selector: 'app-read',
  templateUrl: './read.component.html',
  styleUrls: ['./read.component.css']
})
export class ReadComponent implements OnInit {

  clientes: Cliente[] = [] ;
  constructor(private service:ServiceService, private router: Router, private http:HttpClient ) { }

  ngOnInit(): void {  
   this.getListaClientes()
  }

  getListaClientes(){
    this.http.get<{[key: string]: Cliente}>(this.service.Url+'/all')
    .pipe(map((res) =>{
      const clients = []
      for(const key in res){
        if(res.hasOwnProperty(key)){
          clients.push({...res[key], id: key})
        }
      }
      return clients
    }))     
    .subscribe((clients) =>{
      console.log(clients)
      this.clientes = clients                  
    })    
    }
    
  }