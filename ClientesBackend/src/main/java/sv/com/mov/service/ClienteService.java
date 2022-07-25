package sv.com.mov.service;

import java.util.List;

import sv.com.mov.model.Cliente;

public interface ClienteService {

	List<Cliente> listar();
	Cliente listarId(int id);
	Cliente add(Cliente c);
	Cliente edit(Cliente c);
	Cliente delete(int id);
	
}
