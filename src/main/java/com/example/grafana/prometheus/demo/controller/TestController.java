package com.example.grafana.prometheus.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/message")
	public String teste() {
		return "Funfou!!!";
	}
	
}
