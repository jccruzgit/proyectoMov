package sv.com.mov.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.mov.model.Cliente;
import sv.com.mov.service.ClienteService;

@Service
public class ClienteServiceImp implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente listarId(int id) {	
		return null;
	}

	@Override
	public Cliente add(Cliente c) {	
		return clienteRepository.save(c);
	}

	@Override
	public Cliente edit(Cliente c) {		
		return null;
	}

	@Override
	public Cliente delete(int id) {		
		return null;
	}
	
}
