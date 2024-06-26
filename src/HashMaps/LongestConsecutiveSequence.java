package HashMaps;
import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(
                new SolutionLCQ().longestConsecutive(nums)
        );
    }
}

class SolutionLCQ {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int maxseq = 0;
        int seq = 1;
        Arrays.sort(nums); // O(nlog(n))
        int index = 1;
        while(index < nums.length){
            if(nums[index-1] + 1  == nums[index]) {
                seq++;
            }else if(nums[index-1] + 1  < nums[index]){
                if (maxseq < seq) maxseq = seq;
                seq = 1;
            }
            index++;
        } //O(n)
        if (maxseq < seq) maxseq = seq;

        return maxseq;
    }
}

/*
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

*/