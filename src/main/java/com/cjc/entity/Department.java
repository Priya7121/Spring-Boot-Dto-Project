package com.cjc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Department {
	@Id
	private Integer did;
	private String dname;

}
