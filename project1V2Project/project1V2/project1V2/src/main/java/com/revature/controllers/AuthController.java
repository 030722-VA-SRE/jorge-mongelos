package com.revature.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.DTOs.UsersDTO;
import com.revature.services.AuthServices;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private AuthServices as;
	private static Logger log = LoggerFactory.getLogger(AuthController.class);

	@Autowired
	public AuthController(AuthServices as) {
		super();
		this.as = as;
	}
	@PostMapping
	public ResponseEntity<UsersDTO> login(@RequestParam("username")String userName, @RequestParam("password")String password){
	
		UsersDTO principal = as.login(userName, password);
		
		if(principal == null) {
			
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
			
		}//End if
		
		String token = as.generateToken(principal);
		
		HttpHeaders hh = new HttpHeaders();
		
		hh.set("Authorization", token);
		log.info(MDC.get("userToken"));
		return new ResponseEntity<>(principal, hh, HttpStatus.ACCEPTED);
		
	}//End login()
	
	

}
