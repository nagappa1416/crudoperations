package com.nagappa.SpringBootCRUDDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nagappa.SpringBootCRUDDemo.Model.Employee;
import com.nagappa.SpringBootCRUDDemo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);	
	}
	
	public Employee getEmployee(Integer id) {
		Employee emp = employeeRepository.findById(id).orElse(null); 
		return emp;
	}
	
	public Employee updateEmployee(Employee employee, Integer id) {
		Employee emp = employeeRepository.findById(id).orElse(null);
		if(emp == null) {
			return null;	
		}
		emp.setEmpName(employee.getEmpName());
		emp.setEmpAddress(employee.getEmpAddress());
		emp.setEmpSalary(employee.getEmpSalary());
		
		return employeeRepository.save(emp);
		}
	
	public void deleteEmployee(Integer id) {
	employeeRepository.deleteById(id);
	}
}
