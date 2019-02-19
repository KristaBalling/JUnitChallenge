package com.theironyard;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() throws Exception {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void removePairs() throws Exception{
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @org.junit.Test
    public void converter() throws Exception{
        fail("This test has not been implemented");

    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception{
        fail("This test has not been implemented");

    }
}