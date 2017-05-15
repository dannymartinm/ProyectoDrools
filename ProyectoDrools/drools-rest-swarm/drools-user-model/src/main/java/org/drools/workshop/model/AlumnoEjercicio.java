package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class AlumnoEjercicio {
	private String id_ejercicio;
	private String matricula;
	public int estado;

	public AlumnoEjercicio(){
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public String getId_ejercicio() {
		return id_ejercicio;
	}

	public void setId_ejercicio(String id_ejercicio) {
		this.id_ejercicio = id_ejercicio;
	}

	public AlumnoEjercicio(String id_ejercicio, String matricula, int estado) {
		this.id_ejercicio = id_ejercicio;
		this.matricula = matricula;
		this.estado = estado;
    }
	
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

    @Override
    public String toString() {
        return "AlumnoEjercicio{" + "id_ejercicio=" + id_ejercicio + ", matricula=" + matricula + ", estado=" + estado +"}";
    }
	
}