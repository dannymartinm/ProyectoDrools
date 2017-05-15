
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Recomendacion {
    
    private String ejercicio;

    public Recomendacion() {
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

   /* public Ejercicio(String ejercicio) {
	this.ejercicio = ejercicio;
    }*/
    
}
