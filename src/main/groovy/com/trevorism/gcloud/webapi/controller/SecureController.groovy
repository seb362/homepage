package com.trevorism.gcloud.webapi.controller

import com.trevorism.secure.Roles
import com.trevorism.secure.Secure
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation

import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Api("Secure Operations")
@Path("secure")
class SecureController {

    @ApiOperation(value = "Secure")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Secure(Roles.ADMIN)
    String secure(){
        "secure stuff here"
    }

    @ApiOperation(value = "Secure")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Secure(Roles.USER)
    @Path("user")
    String user(){
        "user stuff here"
    }
}
