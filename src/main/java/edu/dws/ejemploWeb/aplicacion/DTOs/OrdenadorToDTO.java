package edu.dws.ejemploWeb.aplicacion.DTOs;

import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;

/*
 * Clase que usaremos para recoger los datos del ordenador que
 * queremos
 * @author Jmenabc
 */
public class OrdenadorToDTO {

	public static OrdenadorDTO ordenadorToDto(Ordenador pc) {
		OrdenadorDTO pcDTO = new OrdenadorDTO(pc.getIdentificador(), pc.getMarca(), pc.getModelo());
		return pcDTO;
	}

}
