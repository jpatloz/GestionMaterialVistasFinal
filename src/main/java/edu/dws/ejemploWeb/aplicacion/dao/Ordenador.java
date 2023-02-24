package edu.dws.ejemploWeb.aplicacion.dao;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordenadores", schema = "bd_gestor_material_alumnos")
public class Ordenador {
	// Atributos
	@Column(name = "md_uuid", nullable = false)
	private String mdUuid;
	@Column(name = "md_date", nullable = false)
	private Calendar mdDate;
	@Id
	@Column(name = "identificador_pc", unique = true, nullable = false)
	private long identificador;
	@Column(name = "marca_pc", nullable = false)
	private String marca;
	@Column(name = "modelo_pc", nullable = false)
	private String modelo;
	@OneToOne(mappedBy = "pc")
	Alumnos al;

	public Ordenador(long identificador, String marca, String modelo,String mdUuid,Calendar mdDate) {
		super();
		this.identificador = identificador;
		this.marca = marca;
		this.modelo = modelo;
		this.mdUuid = mdUuid;
		this.mdDate = mdDate;
	}

	public Ordenador() {
		super();
	}

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
		return "Ordenador [mdUuid=" + mdUuid + ", mdDate=" + mdDate + ", identificador=" + identificador + ", marca="
				+ marca + ", modelo=" + modelo + ", al=" + al + "]";
	}

	

}
