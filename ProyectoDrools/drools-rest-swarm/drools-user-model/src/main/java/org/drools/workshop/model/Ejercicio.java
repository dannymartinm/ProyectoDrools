/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 
 */
@XmlRootElement
public class Ejercicio {
	public String nombre;
	public String descripcion;
	private String id_ejercicio;
	public int dificultad;
	public String tema;
	public int estado;
	
	public Ejercicio() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getId_ejercicio() {
		return id_ejercicio;
	}

	public void setId_ejercicio(String id_ejercicio) {
		this.id_ejercicio = id_ejercicio;
	}

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	public Ejercicio(String nombre, String descripcion, String id_ejercicio, int dificultad, String tema, int estado) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.id_ejercicio = id_ejercicio;
		this.dificultad = dificultad;
		this.tema = tema;
		this.estado = estado;
	}
	
	@Override
    public String toString() {
        return "Ejercicio{" + "nombre=" + nombre + 
        ", descripcion=" + descripcion + 
        ", id_ejercicio=" + id_ejercicio +
        ", dificultad=" + dificultad +  
        ", estado=" + estado +  
        "}";
    }

}