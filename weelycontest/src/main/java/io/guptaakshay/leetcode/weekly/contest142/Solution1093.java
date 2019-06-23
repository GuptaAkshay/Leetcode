package io.guptaakshay.leetcode.weekly.contest142;

import java.util.ArrayList;
import java.util.List;
/*
* Weekly contest 142
* Question 1093
* sample input test cases
 */
public class Solution1093 {
    
    public double[] sampleStats(int[] count) {
        List<Integer> sampleValues = new ArrayList<>();
        Double modeVal = 0.0, medianVal = 0.0, minVal = 0.0, maxVal = 0.0, meanVal = 0.0, cumalativeFrequency = 0.0;
        Boolean foundMin = Boolean.FALSE;
        for (Integer k = 0; k < count.length; k++) {
            if (count[k] != 0) {
                if (!foundMin) {
                    minVal = k.doubleValue();
                    foundMin = true;
                }
                if (k > maxVal) {
                    maxVal = k.doubleValue();
                }
                if (count[k] > count[modeVal.intValue()]) {
                    modeVal = k.doubleValue();
                }
                meanVal += (count[k] * k);
                cumalativeFrequency += count[k];
            }
        }
        meanVal = meanVal / cumalativeFrequency;
        if (cumalativeFrequency % 2 == 0) {
            int medianLoc1 = (cumalativeFrequency.intValue() / 2) - 1;
            int medianLoc2 = (cumalativeFrequency.intValue() / 2);
            Double firstValue = 0.0;
            int tempSum = 0;
            for (Integer k = 0; k < 255; k++) {
                if (count[k] != 0) {
                    tempSum += count[k];
                    if (firstValue == 0.0 && medianLoc1 < tempSum && medianLoc2 < tempSum) {
                        medianVal = k.doubleValue();
                        break;
                    }
                    if (firstValue == 0.0 && medianLoc1 < tempSum) {
                        firstValue = k.doubleValue();
                    }
                    if (medianLoc2 < tempSum) {
                        medianVal = (firstValue + k.doubleValue()) / 2;
                        break;
                    }
                    
                }
            }
        } else {
            int meadinLoc = (cumalativeFrequency.intValue() / 2);
            int tempSum = 0;
            for (Integer k = 0; k < 255; k++) {
                if (count[k] != 0) {
                    tempSum += count[k];
                    if (meadinLoc < tempSum) {
                        medianVal = k.doubleValue();
                        break;
                    }
                }
            }
        }
        
        double[] output = new double[5];
        output[0] = minVal;
        output[1] = maxVal;
        output[2] = meanVal;
        output[3] = medianVal;
        output[4] = modeVal;
        return output;
    }
}
