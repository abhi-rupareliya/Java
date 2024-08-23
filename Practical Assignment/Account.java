/*   ID   : 21CE117
     Name : Abhi Rupareliya
     Aim  : Design a class named Account that contains: 
             • A private double data field named balance for the account (default 0)
             • A private int data field named id for the account (default 0).  interest rate (default 0). Assume that all accounts have the same interest rate. 
             • A private double data field named annualInterestRate that stores the currentaccount was created.
             • A private Date data field named dateCreated that stores the date when the 
             • A constructor that creates an account with the specified id and initial balance.
             • A no-arg constructor that creates a default account.
             • The accessor method for dateCreated.
             • The accessor and mutator methods for id, balance and annualInterestRate.rate.
             • A method named getMonthlyInterestRate() that returns the monthly interest 
             • A method named withdraw that withdraws a specified amount from the 
             • A method named getMonthlyInterest() that returns the monthly interest.
             • A method named deposit that deposits a specified amount to the account. 
*/

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    public void deposit(double amt) {
        balance += amt;
    }
}