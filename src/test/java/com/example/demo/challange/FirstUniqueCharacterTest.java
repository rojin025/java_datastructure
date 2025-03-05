package com.example.demo.challange;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FirstUniqueCharacterTest {

    @Test
    public void testFirstUniqueCharacter(){
        
        FirstUniqueCharacter firstUnique = new FirstUniqueCharacter();

        assertEquals('a',firstUnique.findFirstUnique("apple"));
        assertEquals('l',firstUnique.findFirstUnique("aaapple"));
        assertEquals('\0',firstUnique.findFirstUnique(""));
    }
}
