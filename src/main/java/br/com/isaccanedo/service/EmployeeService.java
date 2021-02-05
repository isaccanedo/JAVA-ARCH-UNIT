package br.com.isaccanedo.service;

import br.com.isaccanedo.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAll();

    Employee save(Employee employee);

    Optional<Employee> getById(long id);

    void deleteById(long id);
}