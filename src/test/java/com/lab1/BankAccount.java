package com.lab1;

import java.util.Random;

public class BankAccount {
    private int accountNum;
    private String accountName;
    private double balance;
    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getInitialBalance() {
        return balance;
    }

    public void setInitialBalance(double initialBalance) {
        this.balance = initialBalance;
    }

    BankAccount(){
        Random rn =new Random();
        accountNum=rn.nextInt();
        this.accountName="";
        this.balance=0;

    }

    BankAccount(String name,double initialBalance){
        Random rn =new Random();
        accountNum=rn.nextInt();
        this.accountName=name;
        this.balance=initialBalance;


    }

    BankAccount(String name){
        Random rn =new Random();
        accountNum=rn.nextInt();
        this.accountName=name;
        this.balance=0;

    }

    public void deposit(double amount){
        if(amount>0){
            double newBalance=balance+amount;
            balance=newBalance;
            displayInfo();
        }
        else{
            System.out.println("deposit can not be negative");
        }

    }

    public void withdraw(double amount){
        if(amount>0 && amount<balance){
            double newBalance=balance-amount;
            balance=newBalance;
            System.out.println("your new balance is $"+balance);
            displayInfo();
        }
        else{
            System.out.println("withdraw can not be made....please try again");
        }
    }
    public void deposit(double amount,double interest){
        if(amount>0){
            double newBalance=balance+amount;
            balance=newBalance+(interest/100)*newBalance;
            System.out.println("your new balance is $ "+balance);
            displayInfo();
        }
        else{
            System.out.println("deposit can not be negative");
        }

    }

    public void withdraw(double amount,double fee){
        if(amount>0 && amount<balance){
            double newBalance=balance-amount-fee;
            balance=newBalance;
            System.out.println(amount+" has been deducted from your balance");
            displayInfo();

        }
        else{
            System.out.println("withdraw can not be made...please try again");
        }
    }

    public void displayInfo(){
        System.out.println("=================================");
        System.out.println("Account Information: ");
        System.out.println("Account Number: "+ accountNum);
        System.out.println("Name: "+accountName);
        System.out.println("Balance: "+ balance);

    }
}
