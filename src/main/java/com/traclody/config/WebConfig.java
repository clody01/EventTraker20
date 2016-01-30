package com.traclody.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//Ces deux annotations remplassent les fichiers web.xml , appContext.xml et servlet-config.xml
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.traclody")
public class WebConfig {

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");		
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
