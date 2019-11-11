package ch.bzz.timetracker.service;

import ch.bzz.timetracker.data.PersonDAO;
import ch.bzz.timetracker.model.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;


/**
 * services for authentication
 * TimeTracker
 *
 * @author Marcel Suter (Ghwalin)
 */

@Path("auth")
public class AuthenticationService {

    /**
     * gets the number of users in the database
     * @return
     */
    @GET
    @Path("count")
    @Produces(MediaType.APPLICATION_JSON)
    public Response countUsers() {
        Integer userCount = new PersonDAO().count();

        return Response
                .status(200)
                .entity(userCount)
                .build();
    }
}
