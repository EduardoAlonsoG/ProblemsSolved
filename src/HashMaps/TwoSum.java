package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result =  new SolutionTwoSum().twoSum(nums , target);
        System.out.println(
               result[0] +  " , " + result[1]
        );
    }
}
class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer , List<Integer>> restInformation =  new HashMap<>();
        int needed = 0;
        for(int i = 0; i < nums.length; i++){
            needed = target - nums[i];
            if(restInformation.containsKey(needed)){
                result[1] = i;
                result[0] = restInformation.get(needed).get(0);
                return result;
            } else{
                List<Integer> listTemp = new ArrayList<>();
                List<Integer> adder = restInformation.getOrDefault(nums[i], listTemp);
                adder.add(i);
                restInformation.put(nums[i],  adder);
            }

        }
        return result;
    }
}

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 nums = [2,7,11,15], target = 9
 [0,1]
*/