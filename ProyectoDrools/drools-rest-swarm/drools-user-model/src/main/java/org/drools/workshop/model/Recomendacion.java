
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Recomendacion {
    
    private String ejercicio;
    private String materia;
    private int dificultad;

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

   
    @Override
    public String toString() {
        return "Recomendacion{" + "ejercicio=" + ejercicio + "}";
    }

    public Recomendacion(String ejercicio, String materia, int dificultad) {
	this.ejercicio = ejercicio;
    this.materia = materia;
    this.dificultad = dificultad;
    }
    
}
