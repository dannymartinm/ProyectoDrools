package org.drools.workshop.endpoint.api;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.drools.workshop.model.*;

@Path("alumnos")
public interface AlumnoService{
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/inserta")
    public Alumno insertaAlumno(@NotNull Alumno alumno);
    
        
    @GET
    @Produces("application/json")
    @Path("")
    public List<Alumno> getAlumnos();

  /*  @GET
    @Produces("application/json")
    @Path("hermanos")
    public List<Hermano> getHermanos();

    @GET
    @Produces("application/json")
    @Path("ancestros")
    public List<Ancestro> getAncestros();

    @GET
    @Produces("application/json")
    @Path("abuelos")
    public List<Abuelo> getAbuelos(); */
}
