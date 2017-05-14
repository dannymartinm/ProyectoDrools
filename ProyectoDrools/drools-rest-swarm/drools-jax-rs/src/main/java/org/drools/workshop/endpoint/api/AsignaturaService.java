package org.drools.workshop.endpoint.api;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.drools.workshop.model.*;

@Path("asignaturas")
public interface AsignaturaService{
   
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaAsignatura")
    public Asignatura insertaAsignatura(@NotNull Asignatura asignatura);
    
    @GET
    @Produces("application/json")
    @Path("/")
    public List<Asignatura> getAsignatura();
}
