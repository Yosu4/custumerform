package com.project.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.registration.entity.CustomerEntity;
import com.project.registration.usecase.CustomerUsecase;

@RestController
public class RegistrationController {	
	@Autowired
	CustomerUsecase customerUsecase;
	
	@GetMapping("/")
	ModelAndView getRegistrationpage() {
		return customerUsecase.getRegistrationPage();
	}
	
	@PostMapping("/saveCustomer")
	ResponseEntity<String> saveCustomer(@RequestBody CustomerEntity customerEntity) {
		return ResponseEntity.ok().body(customerUsecase.saveCustomer(customerEntity));
	}
}
