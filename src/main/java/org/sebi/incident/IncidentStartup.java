package org.sebi.incident;

import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.transaction.Transactional;

import io.quarkus.runtime.StartupEvent;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.sebi.IIncidentClient;

@ApplicationScoped
public class IncidentStartup {


    
    @Transactional
    void onStart(@Observes StartupEvent ev) {

    }

}
