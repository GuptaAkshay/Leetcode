package io.guptaakshay.leetcode.binarysearch.template1;

class Solution
{
    public int mySqrt( int x )
    {
        int right = x;

        while(right*right > x){
            right = (right + x/right)/2;
        }
        return right;
    }
}
