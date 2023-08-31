package com.test.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Employee;
import com.test.payload.EmpDto;
import com.test.payload.EmpDtoTax;
import com.test.repository.EmployeeRepository;
import com.test.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmployeeRepository empRepo;
	public double tax = 0.0;
	
	@Autowired
	private ModelMapper mapper;
	
	public static double taxCalculate (double salary) {
	
	   double tax = 0.0;
	 
		if(salary >= 2500000)
		{
		  tax = 0;
		}
		else if (salary > 2500000 && salary < 500000 )
		{
		  tax = salary * 5 / 100;
		}
		else if (salary >500000 && salary < 100000) {
		
			 tax = salary * 10 / 100;
		}
		else if ( salary > 100000) {
			
			 tax = salary * 20 / 100;
		}

		return  tax;
		
	}
  
	public static double  Cessamount (double tax) {
		
		double cessamount = tax * 4 / 100;
		
		return cessamount;
		
	}
	

	@Override
	public EmpDto addEmp(EmpDto emp) {
		Employee emp2 = this.mapper.map(emp, Employee.class);
		Employee save = this.empRepo.save(emp2);
		return this.mapper.map(save, EmpDto.class);
	}

	@Override
	public List<EmpDtoTax> getAllEmpBySalryWise() {
		
		List<Employee> list = this.empRepo.findAll();
		List<EmpDto> list2 = list.stream().map(mp-> this.mapper.map(mp, EmpDto.class)).collect(Collectors.toList());
		List<EmpDtoTax> list3 = new ArrayList<>();
		for (EmpDto dto: list2) {
	        EmpDtoTax tax = new EmpDtoTax();
	        tax.setEmpcode(dto.getEmpID());
	        tax.setEmpFirstName(dto.getEmpFirstName());
	        tax.setYearlySalary(dto.getSalary() * 12);
	        tax.setTaxAmount(taxCalculate(dto.getSalary()));
	        tax.setCessAmount(Cessamount(taxCalculate(dto.getSalary())));
	        list3.add(tax);
	    }
		return list3;
	}

}
