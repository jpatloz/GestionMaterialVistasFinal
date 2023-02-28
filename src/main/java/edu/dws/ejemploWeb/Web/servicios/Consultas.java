package edu.dws.ejemploWeb.Web.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.dws.ejemploWeb.aplicacion.DTO.GestionAlumnosDTO;
import edu.dws.ejemploWeb.aplicacion.DTO.GestionAlumnosTODTO;
import edu.dws.ejemploWeb.aplicacion.dal.GestionAlumnos;
import edu.dws.ejemploWeb.aplicacion.dal.GestionAlumnosServicios;
import edu.dws.ejemploWeb.aplicacion.dal.GestionOrdenadores;
import edu.dws.ejemploWeb.aplicacion.dal.GestionOrdenadoresServicios;


@Service
public class Consultas{
	
		@Autowired
		GestionAlumnosServicios gas;
		@Autowired
		GestionOrdenadoresServicios gos;
	
		GestionAlumnosTODTO aDto = new GestionAlumnosTODTO();
		
		//CONSULTAS DE GESTIÓN ALUMNOS
	
		//Consulta para insertar un alumno con su ordenador asignado
		
		public void insertarUnaMatricula(GestionAlumnos gestionAlumnos) {
			gas.save(gestionAlumnos);
		}
		
		//Consulta para coger el ordenador por id 
		
		public GestionOrdenadores buscarOrdenadorPorId(long id) {
			GestionOrdenadores gestionOrdenadores = gos.findById(id).get();
			return gestionOrdenadores;
		}
	
		// Consulta para buscar todos los alumnos
	
		public List<GestionAlumnosDTO> buscarAlumnos() {
			ArrayList<GestionAlumnos> listaGestionALumnos = (ArrayList<GestionAlumnos>) gas.findAll();
			ArrayList<GestionAlumnosDTO> listaGestionAlumnosDTO = aDto.listaGestionAlumnosDTO(listaGestionALumnos);
			return listaGestionAlumnosDTO;
	    }
		
		//Consulta para eliminar a un alumno
		
		public void eliminarUnAlumno(long id) {
			gas.deleteById(id);
		}
		
		//Consulta para buscar un alumno por id de ordenador
		
		public GestionAlumnos buscarAlumnoPorIdOrdenador(long idOrd) {
			GestionOrdenadores ordenadores = gos.findById(idOrd).get();
			GestionAlumnos alumno = ordenadores.getAlumno();
			return alumno;
		}
		
		
		//CONSULTAS DE GESTIÓN ORDENADORES
		
		//Consulta para buscar un ordenador por id de alumno
		public GestionOrdenadores buscarOrdenadorPorIdAlumno(long id) {
			GestionAlumnos alumnos = gas.findById(id).get();
			GestionOrdenadores ordenadores = alumnos.getOrdenadores();
			return ordenadores;
		}

		//Consulta para insertar un ordenador
		
		public void insertarUnOrdenador(GestionOrdenadores gestionOrdenadores) {
			gos.save(gestionOrdenadores);
		}
}
