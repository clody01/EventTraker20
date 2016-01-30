package com.traclody.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Ces deux annotations remplassent les fichiers web.xml , appContext.xml et servlet-config.xml
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.traclody")
public class WebConfig {

}
