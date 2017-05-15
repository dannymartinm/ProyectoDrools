
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Recomendacion {
    
    private String ejercicio;
    private String materia;
    private int dificultad;
    private String descripcion;

    public Recomendacion() {
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }


    public String getEjercicio() {
        return ejercicio;
    }

  
    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
    @Override
    public String toString() {
        return "Recomendacion{" + "ejercicio=" + ejercicio + "}";
    }

    public Recomendacion(String ejercicio, String materia, int dificultad, String descripcion) {
	this.ejercicio = ejercicio;
    this.materia = materia;
    this.dificultad = dificultad;
    this.descripcion = descripcion;
    }
    
}
