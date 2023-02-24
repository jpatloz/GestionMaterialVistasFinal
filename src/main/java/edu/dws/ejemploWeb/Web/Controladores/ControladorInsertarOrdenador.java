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
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWeb.Web.servicios.ConsultasImpl;
import edu.dws.ejemploWeb.aplicacion.DTOs.ADaoImpl;
import edu.dws.ejemploWeb.aplicacion.DTOs.OrdenadorDTO;
import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;
import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;
import edu.dws.ejemploWeb.aplicacion.repositorios.AlumnoRepositorio;
import edu.dws.ejemploWeb.aplicacion.repositorios.OrdenadorRepositorio;

@Controller
public class ControladorInsertarOrdenador {
	// Creamos una instancia de nuestro servicio consukltas para hacer el insert
		@Autowired
		OrdenadorRepositorio pc;
		ConsultasImpl ci = new ConsultasImpl();
		//Instanciamos nuestra clase aDao para poder subir los datos a bbdd
		ADaoImpl aDao = new ADaoImpl();

		@RequestMapping(value = "/guardarOrdenador", method = RequestMethod.POST)
		public ModelAndView guardarOrdenador(@ModelAttribute("ordenata") OrdenadorDTO ordenata) {
			Ordenador pcDao = aDao.ordenadorDToToDAo(ordenata);
			ci.insertarAltaOrdenador(pc,pcDao);
			return new ModelAndView("ordenador");
		}
}
