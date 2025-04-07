package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
