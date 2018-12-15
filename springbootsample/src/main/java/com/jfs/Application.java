package com.jfs;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Application{
	public static void main(String args[])
	{
		//SpringApplication app = new SpringApplication(Application.class);
        //app.setDefaultProperties(Collections
          //.singletonMap("server.port", "8083"));
        //app.run(args);
		SpringApplication.run(Application.class, args);
		
	}
}
