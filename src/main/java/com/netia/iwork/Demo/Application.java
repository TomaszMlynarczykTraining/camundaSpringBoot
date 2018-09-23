package com.netia.iwork.Demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.netia.iwork.Demo.services.interfaces.ProjectService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;

@SpringBootApplication
@EnableProcessApplication

public class Application   {
	
	//  @Autowired
	 // private static  ProjectService projectService;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        //createDefaultUser();
    }
    
    
    public static void createDefaultUser() {
    	//projectService.addProject();
    }
}