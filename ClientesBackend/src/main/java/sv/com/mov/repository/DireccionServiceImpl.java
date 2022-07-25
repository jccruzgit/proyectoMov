package sv.com.mov.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.mov.model.Direccion;
import sv.com.mov.service.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService{
	
	@Autowired 
	private DireccionRepository direccionRepository;

	@Override
	public List<Direccion> listar() {	
		return direccionRepository.findAll();
	}

	@Override
	public Direccion listarId(int id) {		
		return null;
	}

	@Override
	public Direccion add(Direccion c) {		
		return null;
	}

	@Override
	public Direccion edit(Direccion c) {		
		return null;
	}

	@Override
	public Direccion delete(int id) {		
		return null;
	}

}
