package com.dailycoder.departmentservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycoder.departmentservice.model.Department;
import com.dailycoder.departmentservice.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepo departmentRepo;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		return departmentRepo.findById(departmentId).get();
	}
	
	
	
}
