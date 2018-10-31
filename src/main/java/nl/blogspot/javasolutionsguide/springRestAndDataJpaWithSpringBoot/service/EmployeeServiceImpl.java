package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.service;

import lombok.Setter;
import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.entity.Employee;
import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired @Setter
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> retrieveEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long employeeId) {
        Optional<Employee> emp = employeeRepository.findById(employeeId);
        return emp.get();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
