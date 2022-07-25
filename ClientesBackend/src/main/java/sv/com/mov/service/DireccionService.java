package sv.com.mov.service;

import java.util.List;

import sv.com.mov.model.Direccion;

public interface DireccionService {

	List<Direccion> listar();
	Direccion listarId(int id);
	Direccion add(Direccion c);
	Direccion edit(Direccion c);
	Direccion delete(int id);
	
}
