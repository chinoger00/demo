package com.example.demo.services;

import java.io.Serializable;

import com.example.demo.model.dto.UserDTO;

public interface UserService extends Serializable {
	
	public UserDTO getUser(long id);
}
