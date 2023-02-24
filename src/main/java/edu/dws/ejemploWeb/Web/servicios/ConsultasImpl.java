package edu.dws.ejemploWeb.Web.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.dws.ejemploWeb.aplicacion.DTOs.AlumnoToDTO;
import edu.dws.ejemploWeb.aplicacion.DTOs.AlumnosDTO;
import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;
import edu.dws.ejemploWeb.aplicacion.repositorios.OrdenadorRepositorio;

@Service
public class ConsultasImpl implements Consultas {
	
	
	AlumnoToDTO toDTO = new AlumnoToDTO(); 

	// Metodo para insertar alumnos
	public void insertarMatriculaAlumno(AlumnoRepositorio al, Alumnos eva) {
		al.save(eva);

	}

	// Metodo para eliminar alumno por id
	@Override
	public void deleteAlumno(AlumnoRepositorio al, long id) {
		al.deleteById(id);
	}

	// Metodo para listar todos los alumnos existentes
	@Override
	public ArrayList<AlumnosDTO> listarTodosLosAlumnos(AlumnoRepositorio al) {

		ArrayList<Alumnos> alumnos = (ArrayList<Alumnos>) al.findAll();
		ArrayList<AlumnosDTO> alumnosDTO = toDTO.alumnoListToDTO(alumnos);
		return alumnosDTO;
	}

	// Metodo para insertar ordenadores
	@Override
	public void insertarAltaOrdenador(OrdenadorRepositorio pc, Ordenador orde) {
		pc.save(orde);

	}

	// Metodo para buscar ordenadores por id del alumno
	@Override
	public Ordenador buscarPcPorIdDeAlumno(AlumnoRepositorio al, long idAlumno) {
		Alumnos alum = al.findById(idAlumno).get();
		Ordenador devuelto = alum.getPc();
		return devuelto;
	}

	// Metodo para buscar un alumno por id del portatil
	@Override
	public Alumnos buscarAlumnoPorIdDePortatil(OrdenadorRepositorio pcRepo, long pc) {
		Ordenador orde = pcRepo.findById(pc).get();
		Alumnos al = orde.getAl();
		return al;
	}
	
	//Metodo para recoger un ordenador por id

	@Override
	public Ordenador cogerOrdenadorPorId(OrdenadorRepositorio pc, long id) {
		Ordenador orde = pc.findById(id).get();
		return orde;
	}

}
