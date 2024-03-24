package TwoPointers;
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(
                new solutionPES().productExceptSelf(nums)
        );
    }
}

class solutionPES{

    public int[] productExceptSelf(int[] nums) {
        int[] rParts = new int [nums.length];
        int[] lParts = new int [nums.length];

        lParts[0] = 1;
        rParts[nums.length-1] = 1;

        int lp = 0;
        int rp = nums.length -1;

        while(lp < nums.length  && rp > 0){
            lParts[lp+1] = nums[lp] * lParts[lp];
            rParts[rp-1] = nums[rp] * rParts[rp];
            lp++;
            rp--;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = lParts[i] * rParts[i];
        }
        return nums;
    }
}
