
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class AlumnoAsignatura {
	private String nombreAsignatura;
	private String matricula;
	public double promedio;

	public AlumnoAsignatura(){
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public void setNombeAsignatura(String nombreAsignatura){
		this.nombreAsignatura = nombreAsignatura;
	}
	
	public String getNombreAsignatura(){
		return this.nombreAsignatura;
	}

	public void setPromedio(double promedio){
		this.promedio = promedio;
	}
	
	public double getPromedio(){
		return this.promedio;
	}

	public AlumnoAsignatura(String nombreAsignatura, String matricula, double promedio) {
	this.nombreAsignatura = nombreAsignatura;
	this.matricula = matricula;
	this.promedio = promedio;
    }


	@Override
    public String toString() {
        return "AlumnoAsignatura{" + "nombreAsignatura=" + nombreAsignatura + "la lleva el alumno con la matricula=" + matricula + " con promedio "+ promedio +"}";
    }




}
