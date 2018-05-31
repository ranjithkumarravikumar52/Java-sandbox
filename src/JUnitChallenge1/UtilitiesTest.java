package JUnitChallenge1;


import static org.junit.Assert.*;

public class UtilitiesTest {

    Utilities util;

    @org.junit.Before
    public void setup() {
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
/*        //Input: h, e, l, l, o; n = 2
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        int n = 2;

        //expected: e, l
        char[] output = {'e', 'l'};

        //actual
        char[] actual = util.everyNthChar(input, n);

        //test
        assertArrayEquals(output, actual);*/
        assertArrayEquals(new char[]{'e', 'l'}, util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2));

        //when n > size of the input array
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 10));
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
    public void removePairs_emptyStringInput() {
        assertEquals("", util.removePairs(""));
    }

    @org.junit.Test
    public void removePairs_allCharsSameInputString() {
        assertEquals("A", util.removePairs("AAAAAAAAAAAAAAAAAAAA"));
    }

    @org.junit.Test
    public void removePairs_nullInputString() {
        //assertEquals(null, util.removePairs(null));
        assertNull("Remove pairs method doesn't handle null inputs", util.removePairs(null));
    }

    @org.junit.Test
    public void removePairs_singleLengthInputString() {
        assertEquals("A", util.removePairs("A"));
    }

    @org.junit.Test
    public void converter() {
        fail("Test yet to be implemented");
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(util.nullIfOddLength("abc"));
        assertNotNull(util.nullIfOddLength("abcd"));
    }
}