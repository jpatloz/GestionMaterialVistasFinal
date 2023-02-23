package edu.dws.ejemploWeb.Web.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;


@Controller
public class ControladorIndex {

	@RequestMapping(value = "/navegacionFormulario")
	public String navegacionFormulario(Model modelo) {
		Alumnos alumno = new Alumnos();
		modelo.addAttribute("alumnoV", alumno);
		return "formulario";
	}
}
