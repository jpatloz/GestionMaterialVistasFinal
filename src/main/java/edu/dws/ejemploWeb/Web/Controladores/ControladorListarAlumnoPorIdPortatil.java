package edu.dws.ejemploWeb.Web.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWeb.Web.servicios.ConsultasImpl;
import edu.dws.ejemploWeb.aplicacion.DTOs.ADaoImpl;
import edu.dws.ejemploWeb.aplicacion.DTOs.AlumnoToDTO;
import edu.dws.ejemploWeb.aplicacion.DTOs.AlumnosDTO;
import edu.dws.ejemploWeb.aplicacion.DTOs.OrdenadorDTO;
import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;
import edu.dws.ejemploWeb.aplicacion.repositorios.OrdenadorRepositorio;

@Controller
public class ControladorListarAlumnoPorIdPortatil {
	// Creamos una instancia de nuestro servicio consukltas para hacer el insert
			@Autowired
			OrdenadorRepositorio pc;
			ConsultasImpl ci = new ConsultasImpl();
			ADaoImpl aDao = new ADaoImpl();
			AlumnoToDTO toDto = new AlumnoToDTO();
			@RequestMapping(value = "/guardarAlumnoPorIdPortatil", method = RequestMethod.POST)
			public ModelAndView guardarAlumnoPorIdPortatil(@ModelAttribute("ordenador") OrdenadorDTO ordenador,Model model) {
				Ordenador pcDao = aDao.ordenadorDToToDAo(ordenador);
				Alumnos al = ci.buscarAlumnoPorIdDePortatil(pc, pcDao.getIdentificador());
				AlumnosDTO alDto = toDto.alumnoToDto(al);
				model.addAttribute("alumno", alDto);
				return new ModelAndView("alumnoEncontrado");
			}
}
