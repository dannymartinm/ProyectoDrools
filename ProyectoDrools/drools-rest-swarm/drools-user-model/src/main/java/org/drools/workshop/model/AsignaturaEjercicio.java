package org.drools.workshop.model;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;


public class AsignaturaEjercicio {
	
	private String clave;
	private String id_ejercicio;
	public String predecesor;
	
	
	public AsignaturaEjercicio() {
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getId_ejercicio() {
		return id_ejercicio;
	}


	public void setId_ejercicio(String id_ejercicio) {
		this.id_ejercicio = id_ejercicio;
	}


	public String getPredecesor() {
		return predecesor;
	}


	public void setPredecesor(String predecesor) {
		this.predecesor = predecesor;
	}
	
	@Override
    public String toString() {
        return "AsignaturaEjercicio{" + "clave=" + clave + ", id_ejercicio=" + id_ejercicio + ", predecesor=" + predecesor  +"}";
    }


	public AsignaturaEjercicio(String clave, String id_ejercicio, String predecesor) {
		this.clave = clave;
		this.id_ejercicio = id_ejercicio;
		this.predecesor = predecesor;
	}
	


}