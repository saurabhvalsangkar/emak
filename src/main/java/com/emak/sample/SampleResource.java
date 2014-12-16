package com.emak.sample;

import com.emak.resource.BaseResource;
import com.emak.user.User;
import org.springframework.stereotype.Component;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 * Created by GyanomTech Studios on 13/10/2014.
 */
@Path("/v1.0/samples")
@Component
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class SampleResource extends BaseResource {

    @RolesAllowed({"ROLE_GUEST"})
    @GET
    public Response getSample(@Context SecurityContext sc) {
        User user = loadUserFromSecurityContext(sc);
        return Response.ok().entity("{\"message\":\"" + user.getEmailAddress() + " is authorized to access\"}").build();
    }
}
