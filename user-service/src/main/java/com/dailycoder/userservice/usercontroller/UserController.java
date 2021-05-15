package com.dailycoder.userservice.usercontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycoder.userservice.model.ResponseObject;
import com.dailycoder.userservice.model.User;
import com.dailycoder.userservice.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		System.out.println("User details "+user);
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseObject getUserById(@PathVariable("id") Long userId) {
		
		return userService.getUserById(userId);
	}
}
