package org.sebi;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.sebi.incident.Incident;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;

@RegisterRestClient(configKey = "incident")
@Path("/rest/incidents")
@ApplicationScoped
public interface IIncidentClient {

    @GET
    List<Incident> getIncidents(@QueryParam("api_key") String key);
}
