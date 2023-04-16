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
}
