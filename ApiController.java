package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class ApiController {
	
	@Value("${student.Name}")
	private String Name;
	
	@GetMapping("/")
	public String getName()
	{
		return Name;
	}
	
}
