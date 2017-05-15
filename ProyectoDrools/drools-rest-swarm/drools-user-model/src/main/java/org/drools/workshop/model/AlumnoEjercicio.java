package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class AlumnoEjercicio {
	private String id_ejercicio;
	private String matricula;

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

	public AlumnoEjercicio(String id_ejercicio, String matricula) {
	this.id_ejercicio = id_ejercicio;
	this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "AlumnoEjercicio{" + "id_ejercicio=" + id_ejercicio + ", este ejerciccio fue tomado por el alumno con la matricula=" + matricula + "}";
    }
	
}