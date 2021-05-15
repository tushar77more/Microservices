package com.dailycoder.userservice.service;

import com.dailycoder.userservice.model.ResponseObject;
import com.dailycoder.userservice.model.User;

public interface UserService {

	User saveUser(User user);

	ResponseObject getUserById(Long userId);

}
