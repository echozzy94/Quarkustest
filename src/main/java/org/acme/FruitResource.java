package org.acme;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fruit")
public class FruitResource {

    @Inject
    ArrayService fruitservice; //Inject fruitservice

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/addfruit/{name}")
    public String addFruit(@PathParam String name) { //Gebruik greetingservice
        return fruitservice.addFruit(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/removefruit/{name}")
    public String removeFruit(@PathParam String name) { //Gebruik greetingservice
        return fruitservice.removeFruit(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/getfruits")
    public String getAllFruits() { //Gebruik greetingservice
        return fruitservice.getAllFruits();
    }
}
