import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from 'src/app/Modelo/Cliente';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
  
})
export class CreateComponent implements OnInit {

  modelCliente = new Cliente();
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
  }

  Guardar(cliente:Cliente){
    this.service.createCliente(cliente)
    .subscribe(data =>{
      alert("Cliente agregado con éxito...!!!")
      this.router.navigate(["listar"])
    })
  }

}
