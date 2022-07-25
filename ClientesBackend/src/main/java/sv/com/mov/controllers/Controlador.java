package sv.com.mov.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.mov.dto.ClienteRequest;
import sv.com.mov.model.Cliente;
import sv.com.mov.service.ClienteService;
import sv.com.mov.service.DireccionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api/v1/")
public class Controlador {
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	DireccionService direccionService;
	
	@GetMapping(value = "/all")
	public List<Cliente> listar(){
		return clienteService.listar();
	}
	
	@PostMapping(value="/nuevo")
	public Cliente agregar(@RequestBody Cliente c) {
		return clienteService.add(c);
	}
	
	@PostMapping("/agregarCliente")
	public Cliente agregarCliente(@RequestBody ClienteRequest request) {
	 return	clienteService.add(request.getCliente());
	}
	
	@GetMapping("/findAllClientes")
	public List<Cliente> findAllClientes(){
		return clienteService.listar();
		
	}

}
