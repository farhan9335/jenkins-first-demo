package com.example.jenkins.mypack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstDemoController {

	@GetMapping("/message")
	public String getMessage() {
		return "This is first endpoint of FirstDemoController";
	}
}
