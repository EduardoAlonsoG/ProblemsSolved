package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(
                new SolutionCDII().containsNearbyDuplicate(nums, k)
        );
    }
}
class SolutionCDII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer , Integer> elementData = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!elementData.containsKey(nums[i])){
                elementData.put(nums[i] , i);
            }else{
                if(i - elementData.get(nums[i]) <= k){
                    return true;
                }else{
                    elementData.replace(nums[i], i);
                }
            }
        }
        return false;
    }
}

/*
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false

*/