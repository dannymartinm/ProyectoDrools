package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class AlumnoEjercicio {
	private String nombreEjercicio;
	private String matricula;

	public AlumnoEjercicio(){
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public void setNombreEjercicio(String id_ejercicio){
		this.nombreEjercicio = nombreEjercicio;
	}
	
	public String getNombreEjercicio(){
		return this.nombreEjercicio;
	}

	public AlumnoEjercicio(String nombreEjercicio, String matricula) {
	this.nombreEjercicio = nombreEjercicio;
	this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "AlumnoEjercicio{" + "nombreEjercicio=" + nombreEjercicio + ", este ejerciccio fue tomado por el alumno con la matricula=" + matricula + "}";
    }
	
}