package com.restfulservices;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/ftocservice")
public class FtoCService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convertFtoC() throws JSONException {

        JSONObject jsonObject = new JSONObject();
        Double fahrenheit = 98.24;
        Double celsius;
        celsius = (fahrenheit - 32)*5/9;
        jsonObject.put("FarenheitValue", fahrenheit);
        jsonObject.put("CelciusValue", celsius);

        String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
        return Response.status(200).entity(result).build();
    }

    @Path("/reply")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response reply( @FormParam("val") float val)
    {
        JSONObject jsonObject = new JSONObject();
        float celsius;
        celsius =  (val - 32)*5/9;
        jsonObject.put("FarenheitValue", val);
        jsonObject.put("CelciusValue", celsius);

        String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
        return Response.status(200).entity(result).build();

    }
}