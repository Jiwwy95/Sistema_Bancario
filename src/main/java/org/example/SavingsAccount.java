package org.example;

public class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Llama al constructor de la superclase
        this.interestRate = interestRate;
    }

    // Métodos getter y setter
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Método para aplicar interés
    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    @Override
    public String toString() {
        return String.format("Cuenta de Ahorros:\n%s\nTasa de interés: %.2f%%", super.toString(), interestRate);
    }
}