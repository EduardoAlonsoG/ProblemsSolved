package BinarySearch;

public class FindTargetInRotatedSortedArr {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
        while(l <= r){
            int mid = (l + r) /2;
            if(nums[mid] == target) return mid;
            if(nums[l] <= nums[mid]){
                //We are at the left part of the arr
                if(nums[mid] >= target && nums[l] <= target){
                /*
                couse we're at the left part, every element on the left is goin to be lower
                then we check if the target is between the the left most element and the middle element

                if it is, then we pass the right to the middle
                */
                    r = mid;
                }else{
                /*
                    if it is not beetween the left part of the arr
                    we reset the process but this time ignoring the left part
                    taking the left pointer until the middle part + 1
                */
                    l = mid +1;
                }
            }else{
                //We are at the right part of the arr
                if(nums[mid] <= target && nums[r] >= target){
                /*
                As we are on the right part of the array, every element after the middle element is
                goin to be higher

                if the target is between the middle element and the right most element, we search in that
                range takin the left pointer to the middle part
                */
                    l = mid +1;
                }else{
                /*
                if is not between the right part of the arr then we reset the proccess
                but this time ignoring the right part of the arr.
                taking the right pointer to the middle;
                */
                    r = mid;
                }
            }
        }
        return -1;
    }


/*
Basicamente como funciona
nums = [5,6,7,8,9,10,1,2,3,4], target = 10
        l       m         r

nums = [5,6,7,8,9,10,1,2,3,4], target = 10
                  lm r

l <= m -> estamos a la izq del arr
¿m > target > l? -> no

l = m+1

nums = [3,4,5,6,  1,2]
              l   m r



*/
}
