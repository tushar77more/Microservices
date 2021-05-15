/**
 * 
 */
package com.dailycoder.departmentservice.services;

import com.dailycoder.departmentservice.model.Department;

/**
 * @author tusharm
 *
 */
public interface DepartmentService {

	public Department saveDepartment(Department department);

	public Department getDepartmentById(Long departmentId);
}
