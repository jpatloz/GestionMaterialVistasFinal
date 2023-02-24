package edu.dws.ejemploWeb.servicios;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;

@Service
public class ConsultasImpl implements Consultas{
	

	
	public void insertarMatriculaAlumno(AlumnoRepositorio al,Alumnos eva) {
		al.save(eva);
		
	}

	@Override
	public void deleteAlumno(AlumnoRepositorio al, long id) {
		al.deleteById(id);
	}

	@Override
	public void insertarAltaOrdenador(AlumnoRepositorio al, Ordenador eva) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ordenador buscarPcPorIdDeAlumno(AlumnoRepositorio al, long idAlumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumnos buscarAlumnoPorIdDePortatil(AlumnoRepositorio al, long pc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Alumnos> listarTodosLosAlumnos(AlumnoRepositorio al) {
		
		ArrayList<Alumnos> alumnos = (ArrayList<Alumnos>) al.findAll();
		return alumnos;
	}

	

	
	

}
