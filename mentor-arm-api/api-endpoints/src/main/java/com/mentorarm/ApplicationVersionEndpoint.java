package com.mentorarm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author William Arustamyan
 */

@Component
@Path("/version")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ApplicationVersionEndpoint {


    private static final Logger logger = LoggerFactory.getLogger(ApplicationVersionEndpoint.class);

    @Value("${mentor.app.version}")
    private String applicationVersion;

    @Value("${mentor.app.name}")
    private String applicationName;

    @GET
    public Version version() {
        final Version version = new Version(applicationName, applicationVersion);
        logger.info("Return application version : {}", version);
        return version;
    }

}
