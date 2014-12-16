package com.emak.jtex.mms.core.resource;

import com.emak.jtex.mms.core.request.MyDayRequest;
import com.emak.jtex.mms.core.service.MyDayService;
import com.emak.resource.BaseResource;
import com.emak.user.User;
import com.emak.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


/**
 * Created by GyanomTech Studios on 13/10/2014.
 */
@Path("/v1.0/myday")
@Component
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class MyDayResource extends BaseResource {


    private MyDayService myDayService;

    public MyDayResource() {
    }

    @Autowired
    public MyDayResource(MyDayService myDayService) {
        this.myDayService = myDayService;
    }

    @RolesAllowed({"ROLE_USER"})
    @POST
    public Response saveMyDay(@Context SecurityContext sc, MyDayRequest myDayRequest) {
        User user = loadUserFromSecurityContext(sc);

        //save user's Myday in oracle
        Response response = myDayService.saveMyDay(myDayRequest);

        return  response;
        //return Response.ok().entity("{\"message\":\"" + user.getEmailAddress() + " is authorized to access\"}").build();
    }

    @RolesAllowed({"ROLE_GUEST"})
    @GET
    public Response testMyDay(@Context SecurityContext sc) {
        User user = loadUserFromSecurityContext(sc);
        return Response.ok().entity("{\"message\":\"" + user.getEmailAddress() + " is authorized to access\"}").build();
    }
}
