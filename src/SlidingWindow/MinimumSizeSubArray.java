package SlidingWindow;

public class MinimumSizeSubArray {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(
                new SolutionMSSA().minSubArrayLen(target , nums)
        );
    }
}
class SolutionMSSA{
    public int minSubArrayLen(int target, int[] nums) {

        return 0;
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