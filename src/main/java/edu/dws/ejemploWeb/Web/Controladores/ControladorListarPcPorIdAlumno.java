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

import edu.dws.ejemploWeb.Web.servicios.ConsultasImpl;
import edu.dws.ejemploWeb.aplicacion.DTOs.ADaoImpl;
import edu.dws.ejemploWeb.aplicacion.DTOs.AlumnosDTO;
import edu.dws.ejemploWeb.aplicacion.DTOs.OrdenadorDTO;
import edu.dws.ejemploWeb.aplicacion.DTOs.OrdenadorToDTO;
import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;

@Controller
public class ControladorListarPcPorIdAlumno {

	// Creamos una instancia de nuestro servicio consukltas para hacer el insert
		@Autowired
		AlumnoRepositorio al;
		ConsultasImpl ci = new ConsultasImpl();
		ADaoImpl aDao = new ADaoImpl();
		OrdenadorToDTO toDto = new OrdenadorToDTO();
		@RequestMapping(value = "/guardarPcPorIdAlumno", method = RequestMethod.POST)
		public ModelAndView guardarPcPorIdAlumno(@ModelAttribute("alumno") AlumnosDTO alumnoV,Model model) {
			Alumnos alDao = aDao.alumnoDToToDAo(alumnoV);
			Ordenador pc = ci.buscarPcPorIdDeAlumno(al, alDao.getNumeroAlumno());
			OrdenadorDTO pcDto = toDto.ordenadorToDto(pc);
			model.addAttribute("Ordenador", pcDto);
			return new ModelAndView("ordenadorEncontrado");
		}
}
