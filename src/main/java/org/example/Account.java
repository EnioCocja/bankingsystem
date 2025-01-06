package org.example;

public class Account {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }

    public void transfer(double amount, Account anotherAccount) {
        withdraw(amount);
        anotherAccount.deposit(amount);
    }
}

