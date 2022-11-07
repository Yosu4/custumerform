package com.project.registration.util;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class Helper {
	public static boolean patternMatches(String emailAddress, String regexPattern) {
	    return Pattern.compile(regexPattern)
	      .matcher(emailAddress)
	      .matches();
	}
}
