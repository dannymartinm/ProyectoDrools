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
public class EjercicioServiceImpl implements EjercicioService {

    @Inject
    @KReleaseId(groupId = "org.drools.workshop", artifactId = "drools-user-kjar", version = "1.0-SNAPSHOT")
    @KSession
    private KieSession kSession;

    public EjercicioServiceImpl() {
    }

    @Override
    public Ejercicio insertaEjercicio(Ejercicio ejercicio) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Ejercicio: " + ejercicio);
        kSession.insert(ejercicio);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return ejercicio;
    }

	
    @Override
    public List<Ejercicio> getEjercicios() {
        List<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Ejercicio) {
                ejercicios.add((Ejercicio) o);
            }
        }
        return ejercicios;
    }


    private void printKieSessionAllFacts(KieSession kSession) {
        System.out.println(" >> Start - Printing All Facts in the Kie Session");
        for (Object o : kSession.getObjects()) {
            System.out.println(">> Fact: " + o);
        }
        System.out.println(" >> End - Printing All Facts in the Kie Session");
    }

}
