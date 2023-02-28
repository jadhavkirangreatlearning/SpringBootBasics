package com.csi.cotroller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

	@GetMapping
	public String sayHello() {
		return "WELCOME TO FINTECH CSI PUNE";
	}

	@GetMapping("/services")
	public String sayServices() {
		return "SOFTWARE DEVELOPMENT SERVICES";
	}

	@GetMapping("/address")
	public String sayAddress() {
		return "PUNE | MH | INDIA";
	}

	@GetMapping("/listofemployeedata")
	public List<Employee> getAllData(){
		return Stream.of(new Employee(121, "SWARA"), new Employee(122, "VIKRANT")).collect(Collectors.toList());
	}

}
