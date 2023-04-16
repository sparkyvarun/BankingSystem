import org.junit.Test;
import static org.junit.Assert.*;

public class test {

    /**
     * @throws Exception
     */
    @Test
    public void testDeposit() throws Exception {
        BankAccount account = new BankAccount("checking", new Customer("John"));
        account.deposit(100);
        assertEquals(100, account.getBalance(), 0);

    }

    @Test
    public void testWithdraw() throws Exception {
        BankAccount account = new BankAccount("checking", new Customer("John"));
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance(), 0);

    }

    @Test
    public void testAddMoneyToStock() throws Exception {
        BankAccount account = new BankAccount("checking", new Customer("John"));
        account.deposit(100);
        account.addMoneyToStock(50, "checking");
        assertEquals(50, account.getBalance(), 0);

    }

    @Test
    public void testBankAccount() throws Exception {
        BankAccount account = new BankAccount("checking", new Customer("John"));
        account.deposit(100);
        account.withdraw(100);

        assertEquals(0, account.getBalance(), 0);

    }

}
