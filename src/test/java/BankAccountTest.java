import bankAccountApp.BankAccount;
import bankAccountApp.Person;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class BankAccountTest {

    private static Person p;
    private static BankAccount ba;
    @BeforeClass
    public static void init(){
        p = new Person("Mattéo",'M',22,89);
        ba = new BankAccount(100,100,"01/01/2001",p);

    }
    @Test
    public void testDepositMoney(){
        double balance = ba.getBalance();
        ba.depositMoney(100);
        double newBalance = ba.getBalance();

        Assert.assertEquals(balance+100,newBalance,0);
    }

    @Test
    public void testWithdrawTooMuch(){
        Assert.assertFalse(ba.withdrawMoney(500));
    }
}
