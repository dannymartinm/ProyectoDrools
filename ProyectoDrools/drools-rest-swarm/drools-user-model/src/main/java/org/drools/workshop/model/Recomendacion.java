
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Recomendacion {
    
    private String ejercicio;
    private Alumno alumno;

    public Recomendacion() {
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public void setAlumno(Alumnno alumno) {
        this.alumno = alumno;
    }
   
    @Override
    public String toString() {
        return "Recomendacion{" + "ejercicio=" + ejercicio + "}";
    }

   /* public Ejercicio(String ejercicio) {
	this.ejercicio = ejercicio;
    }*/
    
}
