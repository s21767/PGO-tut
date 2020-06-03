package com.lab12;

public class Employee extends User {
    private static int ID = 0;

    Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Client addCustomer(String name, String surname, BankAccount account){
        return new Client(this.name, this.surname, this.account);
    }

    public BankAccount openBankAccount(){
        return new BankAccount();
    }
}
