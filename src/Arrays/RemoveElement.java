package Arrays;



public class RemoveElement {
    public static void main(String[] args) {
        int [] nums = {3,3};
        int val = 5;
        new Solution2().removeElement(nums, val);
    }
}

class Solution2 {
    
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int start = 0 ; 
        int end = nums.length - 1 ;
        while(start < end){
            do{
                //if the start number inside of nums is equal to val, is gonna changeit to the last place of the array, otheways, is gonna ignore it
                if(nums[start] == val ){
                    break;
                }
                start ++;
                
            }while(nums[start] != val && start < end);
            
            while(nums[end] == val && start < end){
                end --;
            }
            
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
        for (int numero : nums) {
            if(numero == val) k--;
        }
        printSolution(nums, k);
        return k;
    }
    
    public void printSolution(int[] nums , int k){
        for(int numero : nums){
            System.out.println(numero);
            
        }
        System.out.println(" -  "+k+"  -");
    }
    
}
