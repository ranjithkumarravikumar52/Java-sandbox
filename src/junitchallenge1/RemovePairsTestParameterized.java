package junitchallenge1;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RemovePairsTestParameterized {

    //assertEquals("ABCDEF", util.removePairs("ABBCDEEF"));
    //assertEquals(expected, util.removePairs(input));
    private String input;
    private String expected;
    private Utilities util;

    public RemovePairsTestParameterized(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCondition() {
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @org.junit.Before
    public void setup() {
        util = new Utilities();
    }

    @org.junit.Test
    public void removePairs_Parameterized() {
        assertEquals(expected, util.removePairs(input));
    }
}
