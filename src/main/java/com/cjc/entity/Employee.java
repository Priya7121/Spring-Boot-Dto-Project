package com.cjc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empid;
	private String empname;
	private String address;
	private Float empSalary;
	@Lob
	private byte[] salatyslip;
	@Lob
	private byte[] adharcard;
	@OneToOne
	private Department dep;

}