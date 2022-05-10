package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.UserRequestDomain;
import com.example.demo.entity.User;
import com.example.demo.header.HeaderGenerator;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/v1")
public class RegisterController {
	
	    @Autowired
	    private UserService userService;
	    
	    @Autowired
	    private HeaderGenerator headerGenerator;
	    
	    
	    
	    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
				produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},value = "/registration")
	    public ResponseEntity<User> addUser(@RequestBody User user, HttpServletRequest request){
	    	//ModelMapper mm = new ModelMapper();
	    	if(user != null)
	    		try {
	    			//User user = mm.map(userModel, User.class);
	    			userService.saveUser(user);
	    			return new ResponseEntity<User>(
	    					user,
	    					headerGenerator.getHeadersForSuccessPostMethod(request, user.getId()),
	    					HttpStatus.CREATED);
	    		}catch (Exception e) {
	    			e.printStackTrace();
	    			return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	    	return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);

}
}
