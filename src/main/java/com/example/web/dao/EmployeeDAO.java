package com.example.web.dao;

import org.springframework.stereotype.Repository;

import com.example.web.model.Employee;
import com.example.web.model.Employees;


 
@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new Employee(1, "Ganesh", "Babu", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Jayashree", "R", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Jebamalai", "Mary", "titanic@gmail.com"));
    }
     
    public Employees getAllEmployees() 
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
