package com.validate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/form")
	public String openForm() {
		
		
		return "form";
	}

}
