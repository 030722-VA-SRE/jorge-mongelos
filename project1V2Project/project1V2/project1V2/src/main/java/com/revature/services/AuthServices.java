package com.revature.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.DTOs.UsersDTO;
import com.revature.exceptions.AuthenticationException;
import com.revature.models.Users;
import com.revature.persistence.UsersRepository;

@Service
public class AuthServices {
	
	private UsersRepository ur;
	private static Logger log = LoggerFactory.getLogger(AuthServices.class);
	
	@Autowired
	public AuthServices(UsersRepository ur) {
		super();
		this.ur = ur;
	}
	
	public String login(String userName, String password) {
		
		Users principal = ur.findUserByUserName(userName);
		
		if(principal == null || !password.equals(principal.getUserPassword())) {
			
			throw new AuthenticationException("Attepmted to login with username: " + userName);
			
		}//End if
		
		log.info(MDC.get("userToken"));
		return principal.getUserId() + ":" + principal.getRole().toString();
		
	}//End login()
	
	public String generateToken(UsersDTO principal) {
		
		return principal.getId() + ":" + principal.getUserName();
		
	}//End generateToken()
	
	

}
