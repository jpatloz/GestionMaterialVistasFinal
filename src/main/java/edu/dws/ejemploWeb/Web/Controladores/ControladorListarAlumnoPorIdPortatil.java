package edu.dws.ejemploWeb.Web.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;
import edu.dws.ejemploWeb.aplicacion.repositorios.OrdenadorRepositorio;
import edu.dws.ejemploWeb.servicios.ConsultasImpl;

@Controller
public class ControladorListarAlumnoPorIdPortatil {
	// Creamos una instancia de nuestro servicio consukltas para hacer el insert
			@Autowired
			OrdenadorRepositorio pc;
			ConsultasImpl ci = new ConsultasImpl();

			@RequestMapping(value = "/guardarAlumnoPorIdPortatil", method = RequestMethod.POST)
			public ModelAndView guardarAlumnoPorIdPortatil(@ModelAttribute("ordenador") Ordenador ordenador,Model model) {
				Alumnos al = ci.buscarAlumnoPorIdDePortatil(pc, ordenador.getIdentificador());
				model.addAttribute("alumno", al);
				return new ModelAndView("alumnoEncontrado");
			}
}
