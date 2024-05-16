package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(
                new SolutionMaElement().majorityElement(nums)
        );
    }
}

class SolutionMaElement {
    public int majorityElement(int[] nums) {
        Map<Integer , Integer> oq =  new HashMap<>();
        for(int n : nums){
            oq.put(n , oq.getOrDefault(n , 0) + 1);
        }

        int maxFreq = 0;
        int mostFreq = 0;

        for(Map.Entry<Integer , Integer> entry : oq.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                mostFreq = entry.getKey();
            }
        }
        return mostFreq;

    }
}

/*
Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
