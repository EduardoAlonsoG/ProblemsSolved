package Greedy;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(new solutionCanJump().canJump(nums));
    }
}

class solutionCanJump{
    public boolean canJump(int[] nums) {
        int finalIndex = nums.length -1 ;
        for (int i = nums.length -1 ; i >= 0 ; i--) {
            if(i + nums[i] >= finalIndex) finalIndex = i;
        }
        return (finalIndex == 0);
    }
}

