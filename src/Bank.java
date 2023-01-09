
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.run();

    }

    public void run() {
        System.out.println("welcome to the bank");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("hello " + name + "we are creating checking and savings accounts for you ");
        Customer customer = new Customer(name);
        System.out.println("Enter your address");
        String address = sc.nextLine();
        customer.setAddress(address);
        BankAccount checkingAccount = new BankAccount("checking", customer);
        BankAccount savingsAccount = new BankAccount("savings", customer);
        System.out.println("your info is :  " + checkingAccount.getCustomerInfo());
        System.out.println("enter amount to deposit in checking account");
        double amount = sc.nextDouble();
        try {
            checkingAccount.deposit(amount);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("enter amount to be deposited in savings account: ");
        amount = sc.nextDouble();
        try {
            savingsAccount.deposit(amount);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("your checking account info is : " + checkingAccount.getAccountInfo());
        System.out.println("your savings account info is : " + savingsAccount.getAccountInfo());
        System.out.println("enter amount to be withdrawn from checking account: ");
        amount = sc.nextDouble();
        checkingAccount.withdraw(amount);

        System.out.println("enter amount to be withdrawn from savings account: ");
        amount = sc.nextDouble();
        savingsAccount.withdraw(amount);
        System.out.println("your checking account info is : " + checkingAccount.getAccountInfo());
        System.out.println("your savings account info is : " + savingsAccount.getAccountInfo());
        System.out.println("enter amount to be added to the stock");
        amount = sc.nextDouble();
        checkingAccount.addMoneyToStock(amount, "checking");
        sc.close();

    }

}
