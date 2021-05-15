package com.dailycoder.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dailycoder.userservice.model.Department;
import com.dailycoder.userservice.model.ResponseObject;
import com.dailycoder.userservice.model.User;
import com.dailycoder.userservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public ResponseObject getUserById(Long userId) {
		ResponseObject obj= new ResponseObject();
		User user= userRepository.findById(userId).get();
		Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
		obj.setUser(user);
		obj.setDepartment(department);
		return obj;
	}
}
