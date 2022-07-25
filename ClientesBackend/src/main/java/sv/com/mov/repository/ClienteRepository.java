package sv.com.mov.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.mov.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	List<Cliente> findAll();
	Cliente findById(int id);
	Cliente save(Cliente c);
	void delete(Cliente c);

}
