package com.example.demo.challange;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class stringCompressionTest {

    stringCompression compressed = new stringCompression();

    @Test
    public void testStringCompressed(){

        assertEquals("a1b2c4", compressed.compressString("abbcccc"));
        assertEquals("a1b1c2", compressed.compressString("abcc"));
    }

}
