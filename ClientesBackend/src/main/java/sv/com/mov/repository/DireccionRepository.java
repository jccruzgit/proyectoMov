package sv.com.mov.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sv.com.mov.model.Direccion;

public interface DireccionRepository extends JpaRepository<Direccion, Integer>{
	
	List<Direccion> findAll();
	Direccion findById(int id);
	Direccion save(Direccion d);
	void delete(Direccion d);

}
