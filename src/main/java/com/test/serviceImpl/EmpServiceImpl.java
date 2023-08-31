package com.test.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Employee;
import com.test.payload.EmpDto;
import com.test.repository.EmployeeRepository;
import com.test.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public EmpDto addEmp(EmpDto emp) {
		Employee emp2 = this.mapper.map(emp, Employee.class);
		Employee save = this.empRepo.save(emp2);
		return this.mapper.map(save, EmpDto.class);
	}

	@Override
	public List<EmpDto> getAllEmpBySalryWise() {
		// TODO Auto-generated method stub
		return null;
	}

}
