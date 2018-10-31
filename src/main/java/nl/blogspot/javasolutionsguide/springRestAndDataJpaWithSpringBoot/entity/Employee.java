package nl.blogspot.javasolutionsguide.springRestAndDataJpaWithSpringBoot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "EMPLOYEE_NAME")
    private String name;

    @Column(name = "EMPLOYEE_SALARY")
    private double salary;

    @Column(name = "DEPARTMENT")
    private String department;
}
