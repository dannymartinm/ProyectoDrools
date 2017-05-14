package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Equipo Rocket
 */
@XmlRootElement

import java.util.*;

public class Asignatura {
	
	public String nombre;
	public String carrera;
	public String idioma;
	private String clave;
	List<Ejercicio> ejercicios = new ArrayList<Ejercicio>();

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
	public List<Ejercicio> getEjercicios() {
		return ejercicios;
	}
	public void setEjercicios(List<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}

	@Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", carrera=" + carrera + ", idioma=" + idioma + ", clave=" + clave + ", ejercicios=" + ejercicios +"}";
    }

    public Asignatura(String nombre, String carrera, String idioma, String clave, List<Ejercicio> ejercicios) {
		this.nombre = nombre;
		this.carrera = carrera;
		this.idioma = idioma;
		this.clave = clave;
		this.ejercicios = ejercicios;
	}

}
