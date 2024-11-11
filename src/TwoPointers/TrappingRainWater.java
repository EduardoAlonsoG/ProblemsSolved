package TwoPointers;

public class TrappingRainWater {
    class Solution {
        public int trap(int[] height) {
            int n = height.length;
            int[] maxLeft = new int[n];
            int[] maxRight = new int[n];
            int waterResult = 0;
            int helpMax = 0;
            for(int i = 0 ; i < n ; i++){
                maxLeft[i] = helpMax;
                helpMax = Math.max(helpMax , height[i]);
            }
            helpMax = 0;
            for(int j = n-1 ;  j >= 0 ; j--){
                maxRight[j] = helpMax;
                helpMax = Math.max(helpMax , height[j]);
            }
            for(int pointer = 0; pointer < n ; pointer++ ){
                int tempWater = Math.min(maxLeft[pointer] , maxRight[pointer]) - height[pointer];
                if(tempWater > 0){
                    waterResult += tempWater;
                }
            }
            return waterResult;
        }
    }
}
