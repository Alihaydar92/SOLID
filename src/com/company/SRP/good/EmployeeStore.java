package com.company.SRP.good;

import com.company.SRP.bad.Employee;

public class EmployeeStore implements IEmployeeStore{

    private IEmailSender  iEmailSender;
    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {

    }
}
