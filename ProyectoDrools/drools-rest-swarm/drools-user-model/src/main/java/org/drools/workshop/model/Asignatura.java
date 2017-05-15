package org.drools.workshop.model;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;


@XmlRootElement

public class Asignatura {
	
	public String nombre;
	public String carrera;
	public String idioma;
	private String clave;
	//List<Ejercicio> ejercicios = new ArrayList<Ejercicio>();

	public Asignatura() {
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", carrera=" + carrera + ", idioma=" + idioma + ", clave=" + clave + "}";
    }

    public Asignatura(String nombre, String carrera, String idioma, String clave) {
		this.nombre = nombre;
		this.carrera = carrera;
		this.idioma = idioma;
		this.clave = clave;
	}

}
