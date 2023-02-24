package edu.dws.ejemploWeb.aplicacion.DTOs;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;

public interface ADaoService {

public Alumnos alumnoDToToDAo(AlumnosDTO al);
	
	public Ordenador ordenadorDToToDAo (OrdenadorDTO pcDTo);
}
