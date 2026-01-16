import bankAccountApp.Bank;
import bankAccountApp.BankAccount;
import bankAccountApp.Person;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class BankTest {

    private static Person p;
    private static BankAccount ba1;
    private static BankAccount ba2;
    private static Bank b;
    @BeforeClass
    public static void init(){
        b = new Bank();
        p = new Person("Mattéo",'M',22,89);
        ba1 = new BankAccount(100,100,"01/01/2001",p);
        ba2 = new BankAccount(200,100,"01/01/2001",p);
        b.addAccount(ba1,0);
        b.addAccount(ba2,0);

    }
    @Test
    public void testGetMaxBalance(){
        Assert.assertEquals(200,b.getMaximumBalance(),0);
    }

}
