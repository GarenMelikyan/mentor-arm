package com.mentorarm.configuration;

import com.mentorarm.config.MentorarmJerseyConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author William Arustamyan
 */
@Configuration
public class ServletRegistrationManager {
    @Value("${server.servlet.context-path}")
    private String serverServletContextPath;

    @Bean
    public ServletRegistrationBean<ServletContainer> jerseyServlet() {
        // Create registration bean
        final ServletRegistrationBean<ServletContainer> servletRegistrationBean = new ServletRegistrationBean<>();
        servletRegistrationBean.setServlet(new ServletContainer());
        servletRegistrationBean.setName("servlet.jersey");
        servletRegistrationBean.getUrlMappings().add(serverServletContextPath + "/*");
        servletRegistrationBean.setOrder(0);
        servletRegistrationBean.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, MentorarmJerseyConfig.class.getName());

        return servletRegistrationBean;
    }
}
