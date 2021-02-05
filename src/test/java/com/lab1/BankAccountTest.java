package com.lab1;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        BankAccount b1=new BankAccount("Sushil",5000);
        b1.deposit(200,0.2);
        b1.withdraw(100000);
        b1.displayInfo();
        b1.withdraw(200);
        BankAccount b2=new BankAccount();
        b2.displayInfo();
        b2.withdraw(9);
        b2.deposit(-9);
        b2.setInitialBalance(2034);
        b2.displayInfo();
        BankAccount b3=new BankAccount("Pandey",5000);
        b3.displayInfo();
    }
}
