package com.nagappa.SpringBootCRUDDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagappa.SpringBootCRUDDemo.Model.Employee;
import com.nagappa.SpringBootCRUDDemo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

@PostMapping("/createEmployee")
public Employee createEmployee(@RequestBody Employee employee) {
	return employeeService.createEmployee(employee);
}
@GetMapping("/getEmployee/{id}")
public Employee getEmployee(@PathVariable Integer id) {
	return employeeService.getEmployee(id);
	
}
@PutMapping("/updateEmployee/{id}")
public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Integer id) {
	return employeeService.updateEmployee(employee, id);
}
@DeleteMapping(("/deleteEmployee/{id}"))
public void deleteEmplyoee(@PathVariable Integer id) {
	employeeService.deleteEmployee(id);
}
}