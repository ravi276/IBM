package com.demo.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.model.employee;
import com.demo.demo.repos.DataRepo;

@Service
public class EmployeeHandler {
@Autowired
DataRepo repo;
 public employee saveData(employee emp)
 {
	 employee data=repo.save(emp);
	 return data;
 }
 
 public employee getDataById(Integer id)
 {
	 Optional<employee >empData=repo.findById(id);
	 return empData.get();
 }
 
 
}
