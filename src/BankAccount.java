
public class BankAccount {
    String accountType;
    double balance;
    Customer customer;

    public BankAccount(String accountType, Customer customer) {
        this.accountType = accountType;
        this.customer = customer;
    }

    public void deposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception(" amount must be positive");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
            return;
        }
        this.balance -= amount;
    }

    public String getAccountInfo() {
        return "\n" + "Account type: " + this.accountType + "\n" + "Balance: " + this.balance;
    }

    public String getCustomerInfo() {
        return "Customer name: " + this.customer.getName() + " ,Address: " + this.customer.getAddress();
    }

    public int addMoneyToStock(double amount, String accountType) {

        this.balance -= amount;

        // a random probablity (30%) the money would be doubled
        if (Math.random() > 0.7) {
            amount *= 10;
            this.balance += amount;
            System.out.println("money 10 times" + "\n" + "your balance is: " + this.balance);
        } else {
            System.out.println("money not 10 times" + "\n" + "your balance is: " + this.balance);
        }

        return 0;

    }

}
