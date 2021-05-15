package com.dailycoder.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycoder.departmentservice.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
