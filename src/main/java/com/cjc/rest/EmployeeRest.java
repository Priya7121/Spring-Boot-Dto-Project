package com.cjc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.dto.EmployeeRequestDto;
import com.cjc.resource.EmployeeResource;

@RestController
public class EmployeeRest {
	@Autowired
	private EmployeeResource empresource;
	@PostMapping(value = "/employees")
	public EmployeeRequestDto addemp(@RequestBody EmployeeRequestDto emprequestdto)
	{
		String msg=empresource.saveemp(emprequestdto);
		
		return emprequestdto;
		
	}

}
