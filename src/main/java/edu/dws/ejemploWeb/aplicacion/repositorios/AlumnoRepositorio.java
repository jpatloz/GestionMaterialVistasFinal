package edu.dws.ejemploWeb.aplicacion.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;

/*
 * Interfaz con todos los metodos CRUD
 * @CrudRepository
 * @Alumnos
 * @Repository
 * @author Jmenabc
 */
@Repository
public interface AlumnoRepositorio extends CrudRepository<Alumnos, Long>{
	
}
