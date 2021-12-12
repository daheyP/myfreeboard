package com.rest.api;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Applications {
    public static void main(String[] args) {

        //SpringApplication app = new SpringApplication(Application.class);
        //app.addListeners(new EventListner2());
        //app.run(args);
        SpringApplication.run(Applications.class, args);

    }
}
