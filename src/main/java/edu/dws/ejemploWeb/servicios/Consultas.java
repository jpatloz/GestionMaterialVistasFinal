package edu.dws.ejemploWeb.servicios;

import java.util.ArrayList;

import javax.transaction.Transactional;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;

/*
 * Interfaz que contendra los metodos de nuestro servicio consultas
 * @author Jmenabc
 */
public interface Consultas {

	public void insertarMatriculaAlumno(Alumnos eva);

	public void deleteAlumno(long id);

	public void insertarAltaOrdenador(Ordenador eva);

	public Ordenador buscarPcPorIdDeAlumno(long idAlumno);

	public Alumnos buscarAlumnoPorIdDePortatil(long pc);

	public ArrayList<Alumnos> listarTodosLosAlumnos();
}
