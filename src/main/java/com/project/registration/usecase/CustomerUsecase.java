package com.project.registration.usecase;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.project.registration.entity.CustomerEntity;
import com.project.registration.repository.CustomerRepository;
import com.project.registration.util.Helper;

@Service
public class CustomerUsecase {
	@Autowired
	CustomerRepository customerRepository;
	
	public ModelAndView getRegistrationPage() {
		ModelAndView mav = new ModelAndView("registrationpage");
		return mav;
	}
	
	public String saveCustomer(CustomerEntity customerEntity) {
		customerEntity.setRegistered(new Date());
		customerEntity.setEmail_address(customerEntity.getEmail_address().toLowerCase());
		
		String regexPattern = "^(.+)@(\\S+)$";
		if(Helper.patternMatches(customerEntity.getEmail_address(), regexPattern)) {
			try {
				customerRepository.save(customerEntity);
			} catch (Exception e) {
				e.printStackTrace();
				return "emailalreadyexist";
			}
			
			System.out.println(customerEntity.toString());
			return "success";
		} else {
			return "formatemailinvalid";
		}
	}
}
