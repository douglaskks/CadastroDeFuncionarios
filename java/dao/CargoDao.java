package dao;

import java.util.List;

import springboot.project.springboot.domain.Cargo;

public interface CargoDao {

	void save(Cargo cargo);
	
	void update (Cargo cargo);
	
	void delete(Long id);
	
	List<Cargo> findAll();

	Cargo findById(Long id);
}
