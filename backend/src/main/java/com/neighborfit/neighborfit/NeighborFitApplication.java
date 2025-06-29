package com.neighborfit.neighborfit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the NeighborFit Spring Boot application.
 * 
 * This class bootstraps the application by scanning components,
 * starting the embedded Tomcat server, and initializing the Spring context.
 */
@SpringBootApplication
public class NeighborFitApplication {

    /**
     * Starts the Spring Boot application.
     * 
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(NeighborFitApplication.class, args);
    }
}
