package io.mulberry.theone;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheOneTest {

    @Test
    public void testOrgToken() throws Exception {
        TheOne theOne = new TheOne();

        String expected = "lewis.kim";
        String actual = theOne.getToken();

        assertEquals(expected, actual);
    }

    @Test
    public void testNewToken() throws Exception {
        TheOne theOne = new TheOne();

        String expected = "yeongeon.kim";
        String actual = theOne.getToken();

        assertEquals(expected, actual);
    }
}