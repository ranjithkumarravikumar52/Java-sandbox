package junitpractice;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankTestParameterized {

    private BankAccount myAccount;
    private double amount;
    private boolean branch;
    private double expected;

    public BankTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup(){
        myAccount = new BankAccount("Ranjith", "Kumar", 1000.00, BankAccount.CHECKING);
        System.out.println("Inside setup(): Running Tests.... ");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCondition(){
        return Arrays.asList(new Object[][]{
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {204.00, true, 1204.00},
                {2003.00, true, 3003.00},
                {530.00, true, 1530.00}
        });
    }

    @org.junit.Test
    public void parameterized_deposit() {
        myAccount.deposit(amount,branch);
        assertEquals(expected, myAccount.getBalance(), 0);
    }
}
