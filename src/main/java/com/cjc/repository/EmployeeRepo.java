package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
