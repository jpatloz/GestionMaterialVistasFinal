package edu.dws.ejemploWeb.Web.Controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;

@Controller
public class Controlador {

	List<Alumnos> alumnos = new ArrayList<Alumnos>();
	Map<String, Object> miModelo = new HashMap<String, Object>();

	// @PostMapping("/guardarAlumno")
	// public String guardarAlumno(@ModelAttribute("alumnoV") Alumno alumnoV) {
	@RequestMapping(value = "/guardarAlumno", method = RequestMethod.POST)
	public ModelAndView guardarAlumno(@ModelAttribute("alumnoV") Alumnos alumnoV) {
		alumnos.add(alumnoV);
		miModelo.put("mensaje", "Todo ok");
		miModelo.put("listaAlumnos", alumnos);
		return new ModelAndView("segunda", "miModelo", miModelo);
	}
}
