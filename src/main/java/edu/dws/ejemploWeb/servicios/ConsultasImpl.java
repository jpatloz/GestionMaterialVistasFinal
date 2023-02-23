package edu.dws.ejemploWeb.servicios;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;

public class ConsultasImpl implements Consultas{
	
	@Autowired
	AlumnoRepositorio ar;

	@Override
	@Transactional
	public void insertarMatriculaAlumno(Alumnos eva) {
		ar.save(eva);
		
	}

	@Override
	@Transactional
	public void deleteAlumno(long id) {
		ar.deleteById(id);
		
	}

	@Override
	@Transactional
	public void insertarAltaOrdenador(Ordenador eva) {
		
		
	}

	@Override
	@Transactional
	public Ordenador buscarPcPorIdDeAlumno(long idAlumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Alumnos buscarAlumnoPorIdDePortatil(long pc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ArrayList<Alumnos> listarTodosLosAlumnos() {
		// TODO Auto-generated method stub
		return null;
	}

}
