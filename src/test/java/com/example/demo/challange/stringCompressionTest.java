package com.example.demo.challange;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class StringCompressionTest {

    @Test
    public void testStringCompressed(){

        StringCompression sc = new StringCompression();
        assertEquals("a1b2c4", sc.compressString("abbcccc"));
        assertEquals("a1b1c2", sc.compressString("abcc"));
        assertEquals("a1", sc.compressString("a"));
        assertEquals("a1b1c1d1", sc.compressString("abcd"));
        assertEquals("", sc.compressString(""));
        assertNull(sc.compressString(null));
    }
}