package com.mentorarm.config;

import com.mentorarm.ApplicationVersionEndpoint;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author William Arustamyan
 */
public final class MentorarmJerseyConfig extends ResourceConfig {

    public MentorarmJerseyConfig() {
        super();
        register(ApplicationVersionEndpoint.class);
    }
}
