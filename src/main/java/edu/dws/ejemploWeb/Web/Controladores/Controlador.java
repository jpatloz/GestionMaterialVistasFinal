package edu.dws.ejemploWeb.Web.Controladores;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;
import edu.dws.ejemploWeb.aplicacion.repositorios.OrdenadorRepositorio;

@Controller
public class Controlador {

	// Creamos una instancia de nuestro servicio consukltas para hacer el insert
	@Autowired
	AlumnoRepositorio al;
	@Autowired
	OrdenadorRepositorio pp;
	ConsultasImpl ci = new ConsultasImpl();
	ADaoImpl aDao = new ADaoImpl();

	@RequestMapping(value = "/guardarAlumno", method = RequestMethod.POST)
	public ModelAndView guardarAlumno(@ModelAttribute("alumnoV") AlumnosDTO alumnoV) {
		long id = alumnoV.getIdPortatil();
		Alumnos alumDao = aDao.alumnoDToToDAo(alumnoV);
		alumDao.setMdUuid(UUID.randomUUID().toString());
		alumDao.setMdDate(Calendar.getInstance());
		Ordenador ordenadoAMeter = ci.cogerOrdenadorPorId(pp, id);
		alumDao.setPc(ordenadoAMeter);
		ci.insertarMatriculaAlumno(al, alumDao);
		return new ModelAndView("segunda");
	}
}
