package SlidingWindow;
public class MinimumSizeSubArray {
    public static void main(String[] args) {
        int[] nums = {2,1,1,4};
        int target = 22;
        System.out.println(new SolutionMSSA().minSubArrayLen(target , nums));
    }
}
class SolutionMSSA{
    public int minSubArrayLen(int target, int[] nums) {
        int lp = 0;
        int rp = 0;
        int ml = 0;
        int cs = nums[0];
        do{
            if(cs >= target) {
                ml = Math.min((rp - lp+1), ml);
                cs = cs - nums[lp];
                lp++;
            }else{
                rp++;
                if(rp < nums.length )
                    cs += nums[rp];
            }
        }while(rp < nums.length && rp > lp );
        return ml;
    }
}

/*
Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1

Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
*/