package edu.dws.ejemploWeb.aplicacion.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;

/*
 * Interfaz con todos los metodos CRUD del Ordenador
 * @CrudRepository
 * @Ordenador
 * @Repository
 * @author Jmenabc
 */
@Repository
public interface OrdenadorRepositorio extends CrudRepository<Ordenador, Long>{

}
