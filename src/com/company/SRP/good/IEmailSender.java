package com.company.SRP.good;


public interface IEmailSender {
    public void sendEmail(Employee employee, IEmailContent content);
}
