package junitchallenge1;


import static org.junit.Assert.*;

public class UtilitiesTest {

    Utilities util;

    @org.junit.Before
    public void setup() {
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        assertArrayEquals(new char[]{'e', 'l'}, util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2));

        //when n > size of the input array
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 10));
    }

    @org.junit.Test
    public void removePairs_test1() {
        // ABBCDEEF -> ABCDEF
        assertEquals("ABCDEF", util.removePairs("ABBCDEEF"));
    }

    @org.junit.Test
    public void removePairs_test2() {
        // "ABCBDEEF" -> "ABCBDEF"
        assertEquals("ABCBDEF", util.removePairs("ABCBDEEF"));
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
        assertEquals(300, util.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void convertor_byZero() throws Exception {
        util.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(util.nullIfOddLength("abc"));
        assertNotNull(util.nullIfOddLength("abcd"));
    }
}