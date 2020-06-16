package com.internetowa.appnet;

import javafx.application.Application;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppnetApplication {

	public static void main(String[] args) {

		Application.launch(Time.class,args);

	}


}
