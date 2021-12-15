package com.demo.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.model.employee;
import com.demo.demo.service.EmployeeHandler;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class RequestController {
@Autowired
EmployeeHandler handler;
	@GetMapping("/getdata/{id}")
	public ResponseEntity<employee> getDatabyId(@PathVariable("id") String id)
	{
		System.out.println("Id is="+id);
		employee emp=handler.getDataById(Integer.parseInt(id));
		return ResponseEntity.status(HttpStatus.OK).body(emp);
	}
	@PostMapping("/publishdata")
	public ResponseEntity<employee> publish(@RequestBody employee emp)
	{
		employee empData=handler.saveData(emp);
		return ResponseEntity.status(HttpStatus.CREATED).body(empData);
	}
	@GetMapping("/hello")
	public String returnData()
	{
		return "Welcome to Service";
	}
		


}
