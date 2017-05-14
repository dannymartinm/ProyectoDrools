
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class AlumnoAsignatura {
	private String nombreAsignatura;
	private String matricula;
	/*public double promedio;
	
	private double obtenerPromedio(){
		//como se sacara el promedio?
		double promedioA=0; 
		
		return promedioA;
	}*/

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

	public AlumnoAsignatura(String nombreAsignatura, String matricula) {
	this.nombreAsignatura = nombreAsignatura;
	this.matricula = matricula;
    }


	@Override
    public String toString() {
        return "AlumnoAsignatura{" + "nombreAsignatura=" + nombreAsignatura + "la lleva el alumno con la matricula=" + matricula + "}";
    }




}

/*
public class AlumnoAsignatura {
    
    private String matricula;
    private String ;

    public Hermano() {
    }

    public String getPersona1() {
        return persona1;
    }

    public void setPersona1(String name) {
        this.persona1 = name;
    }

    public String getPersona2() {
        return persona2;
    }

    public void setPersona2(String name) {
        this.persona2 = name;
    }
   
    @Override
    public String toString() {
        return "Hermano{" + "persona1=" + persona1 + "es hermano de persona2=" + persona2 + "}";
    }

    public Hermano(String persona1, String persona2) {
	this.persona1 = persona1;
	this.persona2 = persona2;
    }
    
}


*/