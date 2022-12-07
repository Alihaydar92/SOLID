package com.company.SRP.bad;

public class EmployeeStore implements IEmployeeStore {
    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    //employee-ye hec bir aiddiyeti yoxdur, oz strukturu( class interface ve.s) olmalidir
    @Override
    public void sendEmail(Employee employee, String content) {

    }
}
