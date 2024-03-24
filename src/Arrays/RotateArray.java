/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author egarcia
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        /*
{-1,-100,3,99
        */
        int k = 1;
        new solutionRotate().rotate(nums, k);
    }
}
class solutionRotate{
    public void rotate(int[] nums, int k) {
        //int[] helper = new int[nums.length];
        
        int carried = nums[0]; 
        int temp = nums[0];
        int newIndex = 0;
        if(k > 0 && nums.length > 1){
            for (int i = 0; i < nums.length ; i++) {
                newIndex =  (newIndex+k) % nums.length ;
                temp = nums[newIndex];
                nums[newIndex] = carried;
                carried = temp;
                
                if(k>1 && nums.length % k == 0 && (i+1) % 2 == 0){
                    newIndex =  ((newIndex + 1) + k) % nums.length ;
                    carried =  nums[newIndex];
                } 

            }
        }
        printResult(nums);
    }
    
    public void printResult(int[] nums){
        for (int n : nums) {
            System.out.println(n);
        }
    }
}

/*
 public void rotate(int[] nums, int k) {
        int[] helper = nums.clone(); 
        for (int i = 0; i < nums.length; i++) {
            int newIndex =  (i+k) % nums.length ;
            nums[newIndex] = helper[i];
        }
    }
*/
