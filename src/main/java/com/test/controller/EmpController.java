package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.payload.EmpDto;
import com.test.service.EmpService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/emp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@PostMapping("/")
	public ResponseEntity<EmpDto> createEmpDetails(@Valid @RequestBody EmpDto dto) {
		EmpDto emp = this.empService.addEmp(dto);
		return new ResponseEntity<EmpDto>(emp , HttpStatus.CREATED);
	}
	
	

}
