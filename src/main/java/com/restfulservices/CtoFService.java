package com.restfulservices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ctofservice")
public class CtoFService {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String convertCtoF() {

        Double fahrenheit;
        Double celsius = 36.8;
        fahrenheit = ((celsius * 9) / 5) + 32;

        String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
        return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
    }

    @Path("/reply")
    @POST
    @Produces(MediaType.APPLICATION_XML)
    public Response reply( @FormParam("val") Double val)
    {
        Double fahrenheit;
        fahrenheit = ((val * 9) / 5) + 32;
        String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
        String finalResult = "<ctofservice>" + "<celsius>" + val + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
        return Response.status(200)
                .entity(finalResult)
                .build();

    }
}