package com.example.demo.challange;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CanFormPalindromeTest {

    
    @Test
    public void testCanFormPalindrome() {
        
        CanFormPalindrome canFormPalindrome = new CanFormPalindrome();
        assertEquals(true, canFormPalindrome.isPalindrome("aabb"));
        assertEquals(true, canFormPalindrome.isPalindrome("aaccbb"));
        assertEquals(true, canFormPalindrome.isPalindrome("aaccbeb"));
        assertEquals(false, canFormPalindrome.isPalindrome("aaccbebedg"));
        assertEquals(false, canFormPalindrome.isPalindrome("aaccbebedgxa"));
        assertEquals(false, canFormPalindrome.isPalindrome(""));

    }
}
