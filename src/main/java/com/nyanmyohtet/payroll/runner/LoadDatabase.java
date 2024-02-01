package com.nyanmyohtet.payroll.runner;

import com.nyanmyohtet.payroll.persistence.model.Employee;
import com.nyanmyohtet.payroll.persistence.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
        return args -> {
            LOGGER.info("preloading: {}", employeeRepository.save(new Employee("Bilbo Baggins", "burglar")));
            LOGGER.info("preloading: {}", employeeRepository.save(new Employee("Frodo Baggins", "thief")));
        };
    }
}
