package edu.dws.ejemploWeb.Web.Controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;
import edu.dws.ejemploWeb.servicios.ConsultasImpl;

@Controller
public class ControladorTodosLosAlumnos {
	// Creamos una instancia de nuestro servicio consukltas para hacer el insert
	@Autowired
	AlumnoRepositorio al;
	ConsultasImpl ci = new ConsultasImpl();
	Map<String, Object> miModelo = new HashMap<String, Object>();

	@RequestMapping(value = "/listarAlumnos", method = RequestMethod.GET)
	public ModelAndView listarAlumnos() {
		ArrayList<Alumnos> alumnos = ci.listarTodosLosAlumnos(al);
		miModelo.put("alumnos", alumnos);
		return new ModelAndView("listadoTodosLosAlumnos", "miModelo", miModelo);
	}

	@RequestMapping(value = "/eliminarAlumno")
	public ModelAndView eliminarAlumno(@RequestParam long numeroAlumno) {
		ci.deleteAlumno(al, numeroAlumno);
		return new ModelAndView("listadoTodosLosAlumnos");
	}
}
