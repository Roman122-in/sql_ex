package com.space.SPACEAPPLICATION;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@GetMapping("/index")
	public String index() {
		return "index";
	}

}