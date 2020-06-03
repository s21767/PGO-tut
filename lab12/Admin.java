package com.lab12;

import java.util.ArrayList;

public class Admin extends User {
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Client addCustomer(String name, String surname, BankAccount account){
        return new Client(this.name, this.surname, this.account);
    }

    public BankAccount openBankAccount(){
        return new BankAccount();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

}
