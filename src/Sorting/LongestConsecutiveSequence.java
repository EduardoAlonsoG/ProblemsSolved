package Sorting;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }
}

class SolutionLCS {
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
