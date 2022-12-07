package com.company.SRP.good;

import com.company.SRP.bad.Employee;

public interface IEmployeeStore {
    public Employee getEmployeeById(Long id);
    public void addEmployee(Employee employee);
}
