package com.nyanmyohtet.payroll.assembler;

import com.nyanmyohtet.payroll.api.rest.EmployeeRestController;
import com.nyanmyohtet.payroll.persistence.model.Employee;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    @Override
    public EntityModel<Employee> toModel(Employee employee) {
        // This project is based on Spring MVC and uses the static helper methods from WebMvcLinkBuilder to build these links.
        // If we are using Spring WebFlux in your project, we must instead use WebFluxLinkBuilder.
        return EntityModel.of(employee,
                linkTo(methodOn(EmployeeRestController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeRestController.class).all()).withRel("employees"));
    }
}
