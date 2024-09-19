package priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInArray {

    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> kHighesEelement = new PriorityQueue<>();
        for(int i = 0 ; i < nums.length ; i ++){
            kHighesEelement.offer(nums[i]);
            if (kHighesEelement.size() > k){
                kHighesEelement.poll();
            }

        }
        return kHighesEelement.poll();
    }

}
