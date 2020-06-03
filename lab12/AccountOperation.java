package com.lab12;

public interface AccountOperation {
    double checkBalance();
    void transfer() throws AccountOperationException;
    void pay() throws AccountOperationException;
}
