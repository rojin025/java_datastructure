package com.example.demo.DataStructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class VotingSystemTest {

    VotingSystem votingSystem = new VotingSystem();

    @Test
    public void testVote(){

        votingSystem.vote("Contestant A");
        votingSystem.vote("Contestant A");
        votingSystem.vote("Contestant B");
        votingSystem.vote("Contestant C");
        votingSystem.vote("Contestant C");
        votingSystem.vote("Contestant C");

        assertEquals(2, votingSystem.getVotes().get("Contestant A"));
        assertEquals(1, votingSystem.getVotes().get("Contestant B"));
        assertEquals(3, votingSystem.getVotes().get("Contestant C"));
    }

    @Test
    public void testOrderOfVotes(){

        votingSystem.vote("Contestant A");
        votingSystem.vote("Contestant A");
        votingSystem.vote("Contestant B");
        votingSystem.vote("Contestant C");
        votingSystem.vote("Contestant C");
        votingSystem.vote("Contestant C");

        assertEquals("Contestant A", votingSystem.getVotes().keySet().iterator().next());
    }

}
