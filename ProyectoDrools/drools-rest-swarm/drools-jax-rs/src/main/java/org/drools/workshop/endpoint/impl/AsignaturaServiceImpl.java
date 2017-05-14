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
public class AsignaturaServiceImpl implements AsignaturaService {

    @Inject
    @KReleaseId(groupId = "org.drools.workshop", artifactId = "drools-user-kjar", version = "1.0-SNAPSHOT")
    @KSession
    private KieSession kSession;

    public AsignaturaServiceImpl() {
    }

    public Asignatura insertaAsignatura(Asignatura asignatura) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Asignatura: " + asignatura);
        kSession.insert(asignatura);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return asignatura;
    }
    
    @Override
    public List<Asignatura> getAsignatura() {
        List<Asignatura> asignaturas = new ArrayList<Asignatura>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Asignatura) {
                asignaturas.add((Asignatura) o);
            }
        }
        return asignaturas;
    }

    private void printKieSessionAllFacts(KieSession kSession) {
        System.out.println(" >> Start - Printing All Facts in the Kie Session");
        for (Object o : kSession.getObjects()) {
            System.out.println(">> Fact: " + o);
        }
        System.out.println(" >> End - Printing All Facts in the Kie Session");
    }

}
