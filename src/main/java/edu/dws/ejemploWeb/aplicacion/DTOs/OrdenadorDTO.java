package edu.dws.ejemploWeb.aplicacion.DTOs;

import java.util.Calendar;

import edu.dws.ejemploWeb.aplicacion.dao.Alumnos;

/*
 * Clase que usaremos para recoger los valores que nos interesan 
 * para mostrarlos por pantalla
 * @author Jmenabc
 */
public class OrdenadorDTO {
	// Atributos
	private String mdUuid;
	private Calendar mdDate;
	private long identificador;
	private String marca;
	private String modelo;
	Alumnos al;

	// Constructor

	public OrdenadorDTO(long identificador, String marca, String modelo, Alumnos al,String mdUuid,Calendar mdDate) {
		super();
		this.identificador = identificador;
		this.marca = marca;
		this.modelo = modelo;
		this.al = al;
		this.mdUuid = mdUuid;
		this.mdDate = mdDate;
	}
	
	public OrdenadorDTO(long identificador, String marca, String modelo) {
		super();
		this.identificador = identificador;
		this.marca = marca;
		this.modelo = modelo;
	}
	public OrdenadorDTO() {
		super();
	}

	// Getters y Setters

	public long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(long identificador) {
		this.identificador = identificador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Alumnos getAl() {
		return al;
	}

	public void setAl(Alumnos al) {
		this.al = al;
	}

	public String getMdUuid() {
		return mdUuid;
	}

	public void setMdUuid(String mdUuid) {
		this.mdUuid = mdUuid;
	}

	public Calendar getMdDate() {
		return mdDate;
	}

	public void setMdDate(Calendar mdDate) {
		this.mdDate = mdDate;
	}

	@Override
	public String toString() {
		return "OrdenadorDTO [mdUuid=" + mdUuid + ", mdDate=" + mdDate + ", identificador=" + identificador + ", marca="
				+ marca + ", modelo=" + modelo + ", al=" + al + "]";
	}

	

}
