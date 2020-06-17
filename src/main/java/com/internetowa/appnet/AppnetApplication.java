package com.internetowa.appnet;

import javafx.application.Application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class AppnetApplication {

	public static void main(String[] args) {

		Application.launch(Time.class,args);

	}


}
