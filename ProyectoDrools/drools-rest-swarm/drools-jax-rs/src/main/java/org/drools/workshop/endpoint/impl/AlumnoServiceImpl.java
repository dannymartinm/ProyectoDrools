package org.drools.workshop.endpoint.impl;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.drools.workshop.model.*;

import org.drools.workshop.endpoint.api.*;
import org.kie.api.cdi.KReleaseId;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;


@ApplicationScoped
public class AlumnoServiceImpl implements AlumnoService {

    @Inject
    @KReleaseId(groupId = "org.drools.workshop", artifactId = "drools-user-kjar", version = "1.0-SNAPSHOT")
    @KSession
    private KieSession kSession;

    public AlumnoServiceImpl() {
    }

    @Override
    public Alumno insertaAlumno(Alumno alumno) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Alumno: " + alumno);
        kSession.insert(alumno);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return alumno;
    }

	
    @Override
    public List<Alumno> getAlumnos() {
        List<Alumno> alumnos = new ArrayList<Alumno>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Alumno) {
                alumnos.add((Alumno) o);
            }
        }
        return alumnos;
    }

  /*  @Override
    public List<Hermano> getHermanos() {
        List<Hermano> hermanos = new ArrayList<Hermano>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Hermano) {
                hermanos.add((Hermano) o);
            }
        }
        return hermanos;
    }

    @Override
    public List<Ancestro> getAncestros() {
        List<Ancestro> ancestros = new ArrayList<Ancestro>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Ancestro) {
                ancestros.add((Ancestro) o);
            }
        }
        return ancestros;
    }

    @Override
    public List<Abuelo> getAbuelos() {
        List<Abuelo> abuelos = new ArrayList<Abuelo>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Abuelo) {
                abuelos.add((Abuelo) o);
            }
        } System.out.println("--------------------ABUELO-----"+ abuelos);
        return abuelos;
    }
*/

    private void printKieSessionAllFacts(KieSession kSession) {
        System.out.println(" >> Start - Printing All Facts in the Kie Session");
        for (Object o : kSession.getObjects()) {
            System.out.println(">> Fact: " + o);
        }
        System.out.println(" >> End - Printing All Facts in the Kie Session");
    }

}
