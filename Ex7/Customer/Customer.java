package Ex7.Customer;

import Ex7.Bank.BankAccount;

public class Customer {
    private String customerName;
    private BankAccount customerAccount;

    public Customer(String customerName, BankAccount customerAccount){
        this.customerName = customerName;
        this. customerAccount = customerAccount;
    }

    public void deposit(double amount){
        customerAccount.deposit(amount);
    }
    public void widthdraw(double amount){
        customerAccount.withdraw(amount);
    }

    public void accountInfo(){
        customerAccount.showAccountInfo();
    }
}
