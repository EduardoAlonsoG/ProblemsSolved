package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInteger {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seenBef = new HashSet<>();
        for(int i : nums){
            if(!seenBef.add(i)) return true;
        }
        return false;
    }
}

/*

Duplicate Integer
Solved
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true
Example 2:

Input: nums = [1, 2, 3, 4]

Output: false


*/