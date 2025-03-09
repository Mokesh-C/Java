package Ex7;

import Ex7.Bank.BankAccount;
import Ex7.Customer.Customer;

public class Accounts {
    public static void main(String[] args) {
        BankAccount ctr1Account = new BankAccount("Hanna", 150000);
        Customer ctr1 = new Customer("Hanna", ctr1Account);
        ctr1.deposit(100000);
        ctr1.accountInfo();
    }
}
