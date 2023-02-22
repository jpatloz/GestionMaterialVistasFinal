package edu.dws.ejemploWeb.Web.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.dws.ejemploWeb.aplicacion.entidades.Alumno;

@Controller
public class ControladorIndex {

	@RequestMapping(value = "/navegacionFormulario")
	public String navegacionFormulario(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumnoV", alumno);
		return "formulario";
	}
}
