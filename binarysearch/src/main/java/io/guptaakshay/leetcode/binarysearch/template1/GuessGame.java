package io.guptaakshay.leetcode.binarysearch.template1;

public class GuessGame
{
    public int guessNumber( int n, int pick )
    {
        int left = 1, right = n;
        while ( left <= right ) {
            int guess =  left + ( right - left ) / 2;
            int result = pick == guess ? 0 : (pick > guess ? 1: -1);
            if ( result == 0 )
                return guess;
            else if ( result == -1 )
                right = guess-1;
            else
                left = guess+1;
        }

        return 0;
    }

}
