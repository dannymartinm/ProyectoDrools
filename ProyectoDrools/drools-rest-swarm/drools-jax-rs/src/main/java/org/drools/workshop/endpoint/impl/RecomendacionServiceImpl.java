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
public class RecomendacionServiceImpl implements RecomendacionService {

    @Inject
    @KReleaseId(groupId = "org.drools.workshop", artifactId = "drools-user-kjar", version = "1.0-SNAPSHOT")
    @KSession
    private KieSession kSession;

    public RecomendacionServiceImpl() {
    }

    public Recomendacion insertaRecomendacion(Recomendacion recomendacion) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Recomendacion: " + recomendacion);
        kSession.insert(recomendacion);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return recomendacion;
    }
    
    @Override
    public List<Recomendacion> getRecomendacioo() {
        List<Recomendacion> recomendaciones = new ArrayList<Recomendacion>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Recomendacion) {
                recomendaciones.add((Recomendacion) o);
            }
        }
        return recomendaciones;
    }

    private void printKieSessionAllFacts(KieSession kSession) {
        System.out.println(" >> Start - Printing All Facts in the Kie Session");
        for (Object o : kSession.getObjects()) {
            System.out.println(">> Fact: " + o);
        }
        System.out.println(" >> End - Printing All Facts in the Kie Session");
    }

}
