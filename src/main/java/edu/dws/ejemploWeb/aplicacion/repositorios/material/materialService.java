package edu.dws.ejemploWeb.aplicacion.repositorios.material;

import java.util.ArrayList;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;

/*
 * Interfaz que contiene la signatura de los metodos a usar 
 * @author Jmenabc
 */
public interface materialService {
	
	public void insertarMatriculaAlumno(Alumnos al);
	
	public void insertarAltaOrdenador(Ordenador pc);
	
	public void eliminarMatriculaAumno(long id);
	
	public Ordenador buscaPcPorAlumno(long idAlumno);
	
	public Alumnos buscaAlumnoPorPc(long idPc);
	
	public ArrayList<Alumnos> alumnos();
	
}