package Ex7.Bank;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(){
        this.accountHolder = "new account holder";
        this.balance = 0.0;
    }
    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void showAccountInfo(){
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account  Balance : " + balance);
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Deposited Successfully...");
        }
        else{
            System.out.println("Invalid Deposit Amount..");
        }
    }

    public void withdraw(double amount){
        if(amount > 0  && amount <= balance){
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully...");
        }
        else{
            System.out.println("Insufficient Balance...");
        }
    }
}
