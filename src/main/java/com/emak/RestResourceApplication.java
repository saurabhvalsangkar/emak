package com.emak;

import com.emak.exception.AccessDeniedExceptionMapper;
import com.emak.filter.jersey.JerseyCrossOriginResourceSharingFilter;
import com.emak.resource.GenericExceptionMapper;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;

import javax.ws.rs.container.ContainerResponseFilter;

/**
 * Created by GyanomTech Studios on 28/07/2014.
 */
public class RestResourceApplication extends ResourceConfig {

    public RestResourceApplication() {

        packages("com.emak.resource", "com.emak.user.resource",
        "com.emak.sample","com.emak.jtex.mms.core.resource");

        register(RequestContextFilter.class);

        ApplicationContext rootCtx = ContextLoader.getCurrentWebApplicationContext();
        ContainerResponseFilter filter = rootCtx.getBean(JerseyCrossOriginResourceSharingFilter.class);
        register(filter);

        register(GenericExceptionMapper.class);
        register(AccessDeniedExceptionMapper.class);

        register(JacksonFeature.class);

    }
}