package com.restfulservices;


import java.net.URI;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;


public class ClientEnd
{
    public static void main(String[] args) {
        try {

            Client client = Client.create();

            WebResource webResource = client
                    .resource(getBaseURI());

            ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON)
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            System.out.println("Output from Server .... \n");
            System.out.println(output);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/ftocservice").build();
    }
}
