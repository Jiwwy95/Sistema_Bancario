package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Método para agregar una cuenta
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Método para buscar una cuenta por número de cuenta
    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Método para mostrar todas las cuentas
    public void displayAllAccounts() {
        for (Account account : accounts) {
            System.out.println(account + "\n");
        }
    }

    // Método main: punto de entrada del programa
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Crear cuentas
        SavingsAccount savings = new SavingsAccount("SA123", 1000.0, 5.0);
        CheckingAccount checking = new CheckingAccount("CA123", 500.0, 200.0);

        // Agregar cuentas al banco
        bank.addAccount(savings);
        bank.addAccount(checking);

        // Mostrar todas las cuentas
        System.out.println("Cuentas iniciales:");
        bank.displayAllAccounts();

        // Aplicar interés a la cuenta de ahorros
        savings.applyInterest();
        System.out.println("Después de aplicar interés a la cuenta de ahorros:");
        System.out.println(savings + "\n");

        // Retirar dinero de la cuenta corriente con sobregiro
        checking.withdraw(600);
        System.out.println("Después de retirar dinero con sobregiro:");
        System.out.println(checking + "\n");
    }
}