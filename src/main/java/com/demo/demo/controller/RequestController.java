package com.demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class RequestController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
		


}
