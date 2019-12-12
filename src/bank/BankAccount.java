package bank;
import java.util.Scanner;
//create a new class for a bank account
public class BankAccount {

    //TODO: create fields for the acct number, balance, customer name email, and phone number
    protected String AccountNum;
    protected String email;
    protected String PhoneNum;
    protected double balance;
    //TODO: create getter for each field

    //get acct num
    protected String getAccountNum(){
        return this.AccountNum;
    }
    //get email
    protected String getEmail(){
        return this.email;
    }
    //get phone #
    protected String getPhoneNum(){
        return this.PhoneNum;
    }
    //get balance
    protected double getBalance(){
        return this.balance;
    }

    //TODO: create setter for each field (i'm just gonna do the whole obj constructor)
    protected void setBankAccount(String AccountNum,
                                  String email,
                                  String PhoneNum,
                                  double balance)
    {
        this.AccountNum = AccountNum;
        this.email = email;
        this.PhoneNum = PhoneNum;
        this.balance = balance;
    }

    //TODO: create two additional methods
    // 1. allow customer to deposit funds (this should increment the balance field)
    // 2. allow customer to withdraw funds. (this should deduct from the balance field,
    //but not allow the withdrawal to complete if there are insufficient funds!!!)


    protected void depositFunds(double DepositAmount){
        this.balance += DepositAmount;
        System.out.println("You have deposited an amount of " + DepositAmount + " your new balance " +
                "is: " + this.balance);
    }


    protected void withdrawFunds(double WithdrawAmount){
        if(this.balance - WithdrawAmount < 0){
            System.out.println("Insufficient funds!!!!");
        }else{
            this.balance -= WithdrawAmount;
            System.out.println("You have withdrawn an amount of "+ WithdrawAmount + " your new balance " +
                    "is: "+ this.balance);
        }
    }

}

