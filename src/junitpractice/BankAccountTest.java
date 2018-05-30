package junitpractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BankAccountTest {

    private BankAccount myAccount;

    @org.junit.BeforeClass
    public static void beforeAnyMethod(){
        System.out.println("This executes before running any tests");
    }

    @org.junit.Before
    public void setup(){
        myAccount = new BankAccount("Ranjith", "Kumar", 1000.00, BankAccount.CHECKING);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        double newBalance = myAccount.withdraw(500.00,true);
        assertEquals(500.00,newBalance,0);
    }

    @org.junit.Test
    public void getBalance_deposit() {
        myAccount.deposit(500,true);
        assertEquals(1500, myAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true(){
        assertTrue(myAccount.isChecking());
    }

    @org.junit.Test
    public void isSavings_false(){
        assertFalse(myAccount.isSavings());
    }

    @org.junit.AfterClass
    public static void afterAllTestMethods(){
        System.out.println("After every tests are done");
    }
}

