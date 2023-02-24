package edu.dws.ejemploWeb.Web.Controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWeb.Web.servicios.ConsultasImpl;
import edu.dws.ejemploWeb.aplicacion.DTOs.AlumnosDTO;
import edu.dws.ejemploWeb.aplicacion.DTOs.OrdenadorDTO;
import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;

@Controller
public class ControladorIndex {
	
	
	//Formulario de alumnos
	@RequestMapping(value = "/navegacionFormulario")
	public String navegacionFormulario(Model modelo) {
		AlumnosDTO alumno = new AlumnosDTO();
		modelo.addAttribute("alumnoV", alumno);
		return "formulario";
	}
	
	//Listado de alumnos

	@RequestMapping(value = "/listarAlumnos")
	public ModelAndView listarAlumnos() {
		return new ModelAndView("listadoTodosLosAlumnos");
	}
	
	//Formulario insertar ordenadores
	@RequestMapping(value = "/insertarOrdenadores")
	public String insertarOrdenadores(Model modelo) {
		OrdenadorDTO ordenata = new OrdenadorDTO();
		modelo.addAttribute("ordenata", ordenata);
		return "insertarOrdenadores";
	}
	
	//Listado de ordenador por id de alumno

		@RequestMapping(value = "/listarPcPorIdAlumno")
		public String listarPcPorIdAlumno(Model modelo) {
			AlumnosDTO al = new AlumnosDTO();
			modelo.addAttribute("alumno",al);
			return "listarPcPorIdAlumno";
		}
		
		//Listado de alumnos por id de portatil

				@RequestMapping(value = "/listarAlumnoPorIdPortatil")
				public String listarAlumnoPorIdPortatil(Model modelo) {
					OrdenadorDTO pc = new OrdenadorDTO();
					modelo.addAttribute("ordenador",pc);
					return "listarAlumnoPorIdPortatil";
				}
}
