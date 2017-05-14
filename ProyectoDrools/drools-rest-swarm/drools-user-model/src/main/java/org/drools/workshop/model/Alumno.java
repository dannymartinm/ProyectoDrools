package org.drools.workshop.model;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Alumno {
	private String matricula;
	public String nombre;
	public String apellido;
	public String carrera;
	public int semestre;

	public Alumno(){
		
	}

	public void setMatricula(String matricula){
		this.matricula = matricula;
	}

	public String getMatricula(){
		return this.matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	@Override
    public String toString() {
		return "Alumno{" +
				"matricula='" + matricula + '\'' +
				", nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				", carrera='" + carrera + '\'' +
				", semestre=" + semestre +
				'}';
	}

	public Alumno(String matricula, String nombre, String apellido, String carrera, int semestre) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
		this.semestre = semestre;
	}
}
