package com.test.service;

import java.util.List;

import com.test.entity.Employee;
import com.test.payload.EmpDto;

public interface EmpService {
	
	public EmpDto addEmp(EmpDto emp);
	public List<EmpDto> getAllEmpBySalryWise();

}
