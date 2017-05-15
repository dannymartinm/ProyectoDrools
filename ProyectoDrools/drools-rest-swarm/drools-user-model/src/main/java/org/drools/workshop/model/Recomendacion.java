
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Recomendacion {
    
    private String ejercicio;
    private String alumno;

    public Recomendacion() {
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }
   
    @Override
    public String toString() {
        return "Recomendacion{" + "ejercicio=" + ejercicio + "}";
    }

    public Recomendacion(String ejercicio, String alumno) {
	this.ejercicio = ejercicio;
    this.alumno = alumno;
    }
    
}
