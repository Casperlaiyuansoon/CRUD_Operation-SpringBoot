package com.bmt.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//annotations
//@Controller tells Spring that this class is a web controller, used to handle HTTP requests. 
//Spring will scan for this annotation and register it as a controller that can respond to HTTP routes.
@Controller 
public class HomeController {
	
	//route 
	//@GetMapping is used to map HTTP GET request to a method
	//Responds to a GET request to the root URL (i.e., http://localhost:8080/).
	//It returns the view name "index".
	
	//Spring Boot will look for a file called index.html (or index.jsp depending on your setup) inside the templates directory (src/main/resources/templates/index.html) to display.
	@GetMapping("/")  
	public String home() {
		return "index";
	}
}
