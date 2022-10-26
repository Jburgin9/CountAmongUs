package com.example.myapplication.player;

import com.example.myapplication.Player;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlayerTest {
    private Player playerTest;

    @BeforeClass
    public void setup(){
        playerTest = new Player();
    }

    @Test
    public void playerNameAlphaOnly(){

    }

    @Test
    public void playerNameContainsNoProfanity(){

    }

    @Test
    public void playerNameMaxLen15Char(){

    }

    @Test
    public void playerNameContainsNoViolence(){

    }
}