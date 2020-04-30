package org.acme.restclient;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Random;


@Path("/predict")

public class LoanCalculatorResource {



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String postCase(@QueryParam("custId") String custId) {

        String predictionArr[] = {"LOW","MEDIUM","HIGH"};
        String predictonRes = predictionArr[new Random().nextInt(2)];

        return "{\"prediction\":"+predictonRes+"}";
    }



}