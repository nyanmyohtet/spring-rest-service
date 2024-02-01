package com.nyanmyohtet.payroll.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super("Could not fine employee " + id);
    }
}
