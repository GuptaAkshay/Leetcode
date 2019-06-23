package io.guptaakshay.leetcode.binarysearch.template1;

import org.junit.Test;

import static org.junit.Assert.*;


public class GuessGameTest
{

    @Test
    public void guessNumber()
    {
        int input = 10, pick = 6;
        int expected = pick;
        int actual = new GuessGame().guessNumber( input, pick );
        assertEquals( expected, actual );
    }
}