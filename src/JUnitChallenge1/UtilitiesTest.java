package JUnitChallenge1;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

public class UtilitiesTest {

    Utilities util;

    @org.junit.Before
    public void setup(){
       util = new Utilities();
    }

    @org.junit.Test
    public void converter() {
        fail("Test yet to be implemented");
    }

    @org.junit.Test
    public void nullIfOddLength() {
        fail("Test yet to be implemented");
    }

    @org.junit.Test
    public void removePairs_test1() {
        //Input String: ABBCDEEF
        //Expected String: ABCDEF
        String inputString = "ABBCDEEF";
        String expectedOutputString = "ABCDEF";

        //call method removePairs()
        String actualOutputString = util.removePairs(inputString);

        //assert(expected, actual)
        assertEquals(expectedOutputString, actualOutputString);

    }

    @org.junit.Test
    public void removePairs_test2() {
        // "ABCBDEEF" -> "ABCBDEF" (the two B's aren't next to each other, so they
        // aren't removed)
        String inputString = "ABCBDEEF";
        String expectedOutputString = "ABCBDEF";

        //call method removePairs()
        String actualOutputString = util.removePairs(inputString);

        //assert(expected, actual)
        assertEquals(expectedOutputString, actualOutputString);

    }

    @org.junit.Test
    public void removePairs_emptyStringInput(){
        assertEquals("",util.removePairs(""));
    }

    @org.junit.Test
    public void removePairs_allCharsSameInputString(){
        assertEquals("A",util.removePairs("AAAAAAAAAAAAAAAAAAAA"));
    }

    @org.junit.Test
    public void removePairs_nullInputString(){
        //assertEquals(null, util.removePairs(null));
        assertNull("Remove pairs method doesn't handle null inputs", util.removePairs(null));
    }

    @org.junit.Test
    public void removePairs_singleLengthInputString(){
        assertEquals("A",util.removePairs("A"));
    }
}