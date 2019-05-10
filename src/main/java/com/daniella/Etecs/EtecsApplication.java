package com.daniella.Etecs;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EtecsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtecsApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean<FacesServlet> servletRegistrationBean() {
		return new ServletRegistrationBean<FacesServlet>(new FacesServlet(), "*.xhtml");
	}

}
