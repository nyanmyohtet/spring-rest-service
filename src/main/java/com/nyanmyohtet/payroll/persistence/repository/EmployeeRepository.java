package com.nyanmyohtet.payroll.persistence.repository;

import com.nyanmyohtet.payroll.persistence.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
