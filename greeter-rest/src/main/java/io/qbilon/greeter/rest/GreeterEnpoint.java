package io.qbilon.greeter.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import io.qbilon.greeter.api.Greeter;

/**
 * GreeterEnpoint
 */
@Path("/greet")
@Component(service = GreeterEnpoint.class, property = {"osgi.jaxrs.resource=true"})
public class GreeterEnpoint {

    @Reference
    private Greeter greeter;

    @GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String greet(@PathParam("name") String name){
       return  greeter.getGreeting(name);
    }
    
}