package org.sebi.incident;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.sebi.IIncidentClient;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("rest/incidents")
public class IncidentResource {

    @RestClient
    @Inject
    IIncidentClient incidentClient;

    @ConfigProperty(name = "my-secret")
    String secret;

    @GET
    public List<Incident> getIncidents(){
       return incidentClient.getIncidents(secret);
    } 
}
