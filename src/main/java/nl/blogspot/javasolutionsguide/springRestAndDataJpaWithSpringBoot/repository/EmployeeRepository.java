package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.repository;

import nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
