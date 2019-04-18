package org.acme.testapp.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/health")
public class HealthEndpoint implements Serializable {

    private static final long serialVersionUID = -2630425175177495070L;

    @GET
    public String alive() {
        return "UP";
    }

}
