package io.guptaakshay.leetcode.binarysearch.diy;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void searchTargetWhenPresent() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int actualPosition = 4;
        int expectedPosition = new Solution().search(nums, target);
        Assert.assertEquals(actualPosition, expectedPosition);
    }
    
    @Test
    public void searchTargetWhenNotPresent() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int actualPosition = -1;
        int expectedPosition = new Solution().search(nums, target);
        Assert.assertEquals(actualPosition, expectedPosition);
    }
}