package edu.dws.ejemploWeb.Web.Controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;
import edu.dws.ejemploWeb.servicios.ConsultasImpl;

@Controller
public class Controlador {

	// Creamos una instancia de nuestro servicio consukltas para hacer el insert
	@Autowired
	AlumnoRepositorio al;
	ConsultasImpl ci = new ConsultasImpl();
	List<Alumnos> alumnos = new ArrayList<Alumnos>();
	Map<String, Object> miModelo = new HashMap<String, Object>();

	@RequestMapping(value = "/guardarAlumno", method = RequestMethod.POST)
	public ModelAndView guardarAlumno(@ModelAttribute("alumnoV") Alumnos alumnoV) {
		ci.insertarMatriculaAlumno(al,alumnoV);
		return new ModelAndView("segunda");
	}
}
