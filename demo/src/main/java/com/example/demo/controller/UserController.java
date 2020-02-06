package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.services.UserService;

@RestController
@RequestMapping(value = "api/v1/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
}
