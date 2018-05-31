package JUnitChallenge1;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RemovePairsTestParameterized {

    //assertEquals("ABCDEF", util.removePairs("ABBCDEEF"));
    private String input;
    private String expected;
    private Utilities util = new Utilities();

    public RemovePairsTestParameterized(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    //Parameterized.Parameters
    /*
    "ABCDEFF", "ABCDEF"
    "AB88EFFG", "AB8EFG"
    "112233445566", "123456"
    "ZYZQQB", "ZYZQB"
    "A", "A"
     */

    @Parameterized.Parameters
    public static Collection<String> testCondition() {
        return Arrays.asList(new String(){
                                 {"ABCDEFF", "ABCDEF"},
                                 {"AB88EFFG", "AB8EFG"},
                                 {"112233445566", "123456"},
                                 {"ZYZQQB", "ZYZQB"},
                                 {"A", "A"}
        };


    }

    @org.junit.Test
    public void removePairs_Parameterized() {
        assertEquals(expected, util.removePairs(input));
    }


}
