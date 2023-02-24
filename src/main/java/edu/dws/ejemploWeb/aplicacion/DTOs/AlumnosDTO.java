package edu.dws.ejemploWeb.aplicacion.DTOs;

import java.util.Calendar;

import javax.persistence.Column;

import edu.dws.ejemploWeb.aplicacion.dao.Ordenador;

/*
 * Clase de alumno que usamos para traernos la informacion que queremos
 * @author Jmenabc
 */
public class AlumnosDTO {
	// Atributos
	private String mdUuid;
	private Calendar mdDate;
	private long numeroAlumno;
	private String nombreAlumno;
	private String telefonoAlumno;
	private long idPortatil;
	Ordenador pc;

	public AlumnosDTO(long numeroAlumno, String nombreAlumno, String telefonoAlumno, Ordenador pc,String mdUuid,Calendar mdDate,long idPortatil) {
		super();
		this.numeroAlumno = numeroAlumno;
		this.nombreAlumno = nombreAlumno;
		this.telefonoAlumno = telefonoAlumno;
		this.pc = pc;
		this.mdUuid = mdUuid;
		this.mdDate = mdDate;
		this.idPortatil = idPortatil;
	}
	
	public AlumnosDTO(long numeroAlumno, String nombreAlumno, String telefonoAlumno) {
		super();
		this.numeroAlumno = numeroAlumno;
		this.nombreAlumno = nombreAlumno;
		this.telefonoAlumno = telefonoAlumno;
	}

	public AlumnosDTO() {
		super();
	}

	public long getNumeroAlumno() {
		return numeroAlumno;
	}

	public void setNumeroAlumno(long numeroAlumno) {
		this.numeroAlumno = numeroAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getTelefonoAlumno() {
		return telefonoAlumno;
	}

	public void setTelefonoAlumno(String telefonoAlumno) {
		this.telefonoAlumno = telefonoAlumno;
	}

	public Ordenador getPc() {
		return pc;
	}

	public void setPc(Ordenador pc) {
		this.pc = pc;
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
	

	public long getIdPortatil() {
		return idPortatil;
	}

	public void setIdPortatil(long idPortatil) {
		this.idPortatil = idPortatil;
	}

	@Override
	public String toString() {
		return "AlumnosDTO [mdUuid=" + mdUuid + ", mdDate=" + mdDate + ", numeroAlumno=" + numeroAlumno
				+ ", nombreAlumno=" + nombreAlumno + ", telefonoAlumno=" + telefonoAlumno + ", pc=" + pc + "]";
	}
	
	

	

}
