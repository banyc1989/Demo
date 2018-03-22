package com.example.demo;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.JerseyConfig;

@RestController
@SpringBootApplication
public class DemoApplication {

	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		new SpringApplicationBuilder(DemoApplication.class).run(args);
	}
	
	@Bean
    public ServletRegistrationBean jerseyServlet() {
      ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/rest/*");
       // our rest resources will be available in the path /rest/*
       registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
       return registration;

    }

}
