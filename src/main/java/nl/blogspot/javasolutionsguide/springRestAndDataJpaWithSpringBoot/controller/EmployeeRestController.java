package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.controller;

import lombok.Setter;
import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.entity.Employee;
import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {

    @Autowired
    @Setter
    EmployeeService employeeService;

    @GetMapping("/api/employees")
    public List<Employee> getEmployees(){
        return employeeService.retrieveEmployees();
    }

    @GetMapping("/api/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable(name="employeeId")Long employeeId){
        return employeeService.getEmployee(employeeId);
    }

    @PostMapping("/api/employees")
    public void saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        System.out.println("Employee Saved Successfully");
    }

    @DeleteMapping("/api/employees/{employeeId}")
    public void deleteEmployee(@PathVariable(name="employeeId")Long employeeId){
        employeeService.deleteEmployee(employeeId);
        System.out.println("Employee Deleted Successfully");
    }

    @PutMapping("/api/employees/{employeeId}")
    public void  updateEmployee(Employee employee, @PathVariable(name="employeeId")Long employeeId){
        Employee emp = employeeService.getEmployee(employeeId);
        if(emp!=null){
            employeeService.updateEmployee(employee);
        }
    }
}
