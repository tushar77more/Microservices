package com.dailycoder.departmentservice.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycoder.departmentservice.model.Department;
import com.dailycoder.departmentservice.services.DepartmentService;


@RestController
@RequestMapping("/departments")
public class DepartmentController {

	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping(value = "/")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println("In department save method  "+department.toString());
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long departmentId) {
		
		return departmentService.getDepartmentById(departmentId);
	}
}
