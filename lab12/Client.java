package com.lab12;

public class Client extends User implements AccountOperation{
    private BankAccount account;
    private static int ID = 0;

    Client(String name, String surname, BankAccount account){
        this.account = account;
        super.name = name;
        super.surname = surname;
    }

    @Override
    public double checkBalance() {
        return account.checkBalance();
    }

    @Override
    public void transfer() throws AccountOperationException {
    }

    @Override
    public void pay() throws AccountOperationException {
    }
}
