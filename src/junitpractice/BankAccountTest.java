package junitpractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BankAccountTest {

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount myAccount = new BankAccount("Ranjith", "Kumar", 1000.00, BankAccount.CHECKING);
        double newBalance = myAccount.withdraw(500.00,true);
        assertEquals(500.00,newBalance,0);
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount myAccount = new BankAccount("Ranjith", "Kumar", 1000.00, BankAccount.CHECKING);
        //I'm gonna deposit 500 bucks at the bank, into my bank account
        myAccount.deposit(500,true);
        assertEquals(1500, myAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true(){
        BankAccount myAccount = new BankAccount("Ranjith", "Kumar", 1000.00, BankAccount.CHECKING);
        assertTrue(myAccount.isChecking());
    }

    @org.junit.Test
    public void isSavings_false(){
        BankAccount myAccount = new BankAccount("Ranjith", "Kumar", 1000.00, BankAccount.CHECKING);
        assertFalse(myAccount.isSavings());
    }
}

