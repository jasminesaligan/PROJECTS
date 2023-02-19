// Write a program that takes user input using Scanner
//  class to create an object of class 'BankAccount'. The BankAccount 
//  class should have account number, account holder name, and 
//  balance as its attributes. The program should perform deposit 
//  and withdrawal operations on the account and print out the updated balance.

import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }
    
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }
    
    public double getBalance() {
        return balance;
    }
}

public class co17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine(); // to consume the newline character
        
        System.out.print("Enter account holder name: ");
        String accountHolderName = sc.nextLine();
        
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        
        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);
        
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        
        System.out.println("Updated balance: " + account.getBalance());
        
        sc.close();
    }
}
