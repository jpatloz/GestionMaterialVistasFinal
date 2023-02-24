package edu.dws.ejemploWeb.servicios;

import java.util.ArrayList;

import javax.transaction.Transactional;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;
import edu.dws.ejemploWeb.aplicacion.repositorios.OrdenadorRepositorio;

/*
 * Interfaz que contendra los metodos de nuestro servicio consultas
 * @author Jmenabc
 */
public interface Consultas {

	public void insertarMatriculaAlumno(AlumnoRepositorio al,Alumnos eva);

	public void deleteAlumno(AlumnoRepositorio al,long id);

	public void insertarAltaOrdenador(OrdenadorRepositorio pc,Ordenador orde);

	public Ordenador buscarPcPorIdDeAlumno(AlumnoRepositorio al,long idAlumno);

	public Alumnos buscarAlumnoPorIdDePortatil(OrdenadorRepositorio pcRepo,long pc);

	public ArrayList<Alumnos> listarTodosLosAlumnos(AlumnoRepositorio al);
}
