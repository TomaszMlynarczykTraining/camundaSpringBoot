package com.netia.iwork.Demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.netia.iwork.Demo.services.interfaces.ProjectService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;

@SpringBootApplication
@EnableProcessApplication
@EnableConfigurationProperties(ApplicationProperties.class)
@Import({ApplicationMainConfiguration.class})


public class Application   {
	
	//  @Autowired
	 // private static  ProjectService projectService;
	
    public static void main(String[] args) {
	final SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
        //createDefaultUser();
    }
    
    
    public static void createDefaultUser() {
    	//projectService.addProject();
    }
}
