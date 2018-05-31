package JUnitChallenge1;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() {
        fail("Test yet to be implemented");
    }

    @org.junit.Test
    public void removePairs_test1() {
        //create Utilities object
        Utilities util = new Utilities();

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
        //create Utilities object
        Utilities util = new Utilities();

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
        Utilities util = new Utilities();
        assertEquals("",util.removePairs(""));
    }

    @org.junit.Test
    public void removePairs_allCharsSameInputString(){
        Utilities util = new Utilities();
        assertEquals("A","AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @org.junit.Test
    public void removePairs_nullInputString(){
        Utilities util = new Utilities();
        assertEquals(null, util.removePairs(null));
    }

    @org.junit.Test
    public void converter() {
        fail("Test yet to be implemented");
    }

    @org.junit.Test
    public void nullIfOddLength() {
        fail("Test yet to be implemented");
    }
}