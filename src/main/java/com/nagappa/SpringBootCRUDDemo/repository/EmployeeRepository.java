package com.nagappa.SpringBootCRUDDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nagappa.SpringBootCRUDDemo.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
 