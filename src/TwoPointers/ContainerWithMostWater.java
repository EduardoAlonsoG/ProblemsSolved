package TwoPointers;

public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int maximumWater = 0;
        int lp = 0;
        int rp = heights.length -1;

        while(lp < rp){
            int areaLength = rp - lp;
            int heigth = Math.min(heights[lp] , heights[rp]);
            maximumWater = Math.max(areaLength * heigth ,maximumWater);
            if(heights[lp] > heights[rp]){
                rp --;
            }else{
                lp++;
            }
        }
        return maximumWater;
    }
}

/*
You are given an integer array heights where heights[i] represents the height of the
i
t
h
i
th
  bar.

You may choose any two bars to form a container. Return the maximum amount of water a container can store.

Example 1:



Input: height = [1,7,2,5,4,7,3,6]

Output: 36
Example 2:

Input: height = [2,2,2]

Output: 4

*/
