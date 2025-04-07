package com.cjc.resource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cjc.dto.EmployeeRequestDto;
import com.cjc.service.DepartmentService;
import com.cjc.service.EmployeeService;

@Component
public class EmployeeResource {
	@Autowired
	private EmployeeService empservice;
	@Autowired
	private DepartmentService depservice;
   @Autowired
   
   private ModelMapper modelmapper;
	public String saveemp(EmployeeRequestDto emprequestdto) {
		
		
	}

}
