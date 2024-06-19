package org.example;

public class Account {
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Métodos getter y setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Método para depositar dinero
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Método para retirar dinero
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    // Método toString para representar la cuenta
    @Override
    public String toString() {
        return String.format("Número de cuenta: %s\nSaldo: %.2f", accountNumber, balance);
    }
}