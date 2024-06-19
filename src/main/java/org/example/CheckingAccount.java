package org.example;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance); // Llama al constructor de la superclase
        this.overdraftLimit = overdraftLimit;
    }

    // Métodos getter y setter
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Método para retirar dinero con overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public String toString() {
        return String.format("Cuenta Corriente:\n%s\nLímite de sobregiro: %.2f", super.toString(), overdraftLimit);
    }
}