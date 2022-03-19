package dao;

import java.util.List;

import springboot.project.springboot.domain.Departamento;

public interface DepartamentoDao {

	void save(Departamento departamento);
	
	void update(Departamento departamento);
	
	void delete(Long id);
	
	List<Departamento> findAll();

	Departamento findById(Long id);
}
