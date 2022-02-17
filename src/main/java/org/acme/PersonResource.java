package org.acme;

import org.codehaus.jackson.map.ObjectMapper;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/person")
public class PersonResource {

    @Inject
    PersonService personService;

    ObjectMapper mapper = new ObjectMapper();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/getall")
    public String getPersons() {
        String x = "";
        for (Person p : personService.getPersonList()){
            x += p.toString() + "\n";
        }
        return x;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/add")
    public String addPerson(String json) throws IOException {
        Person p = mapper.readValue(json, Person.class);
        personService.addPerson(p);
        return "Added " + p.getName().toString() + " to ArrayList";
    }
}
