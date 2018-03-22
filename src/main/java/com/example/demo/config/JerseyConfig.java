package com.example.demo.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.demo.jesery.impl.QueryInfoRestImpl;

@Component
@ApplicationPath("/abc") 
public class JerseyConfig extends ResourceConfig {
	
    public JerseyConfig() {
//       register(RequestContextFilter.class);
       register(QueryInfoRestImpl.class);
       //配置restful package.
       packages("com.example.demo.jesery.impl");

    }

}
