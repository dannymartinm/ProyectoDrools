
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class AlumnoAsignatura {
	private String clave;
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
	
	public void setClave(String clave){
		this.clave = clave;
	}
	
	public String getClave(){
		return this.clave;
	}

	public void setPromedio(double promedio){
		this.promedio = promedio;
	}
	
	public double getPromedio(){
		return this.promedio;
	}

	public AlumnoAsignatura(String clave, String matricula, double promedio) {
	this.clave = clave;
	this.matricula = matricula;
	this.promedio = promedio;
    }


	@Override
    public String toString() {
        return "AlumnoAsignatura{" + "clave=" + clave + "la lleva el alumno con la matricula=" + matricula + " con promedio "+ promedio +"}";
    }




}
