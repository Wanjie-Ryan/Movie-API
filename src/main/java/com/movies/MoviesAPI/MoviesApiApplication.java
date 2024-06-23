package com.movies.MoviesAPI;


import org.springframework.boot.SpringApplication;
// springApplication contains a method called run which is used to run the spring application

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// the spring boot application allows the compiler to know what this specific file does


// the annotations (@) tell the compiler what the file is for
@SpringBootApplication
//@RestController
// the annotation, RestController tells the compiler that this file is for creating REST api
public class MoviesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApiApplication.class, args);
	}

//	@GetMapping("/")
//	the GetMapping annotation tells the compiler that the apiRoot method is a GET request.

//	public String apiRoot(){
//		return "This is my first JavaSpring API";
//	}

}
