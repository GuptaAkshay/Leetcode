package io.guptaakshay.leetcode.binarysearch.template1;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class SqrtTest
{

    @Test
    public void mySqrtForPerfectSquare()
    {
        List<Integer> inputList = Arrays.asList( 4,16,25,9,49 );
        List<Integer> expectedList = Arrays.asList( 2,4,5,3,7 );
        List<Integer> actualList = new ArrayList<>(  );
        for(Integer val : inputList){
            Integer acutal = new Solution().mySqrt( val );
            actualList.add( acutal );
        }
        assertEquals( expectedList, actualList);
    }

    @Test
    public void mySqrtForNonPerfectSquare()
    {
        List<Integer> inputList = Arrays.asList( 8,17,27,10,50 );
        List<Integer> expectedList = Arrays.asList( 2,4,5,3,7 );
        List<Integer> actualList = new ArrayList<>(  );
        for(Integer val : inputList){
            Integer acutal = new Solution().mySqrt( val );
            actualList.add( acutal );
        }
        assertEquals( expectedList, actualList);
    }
}