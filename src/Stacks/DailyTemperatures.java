package Stacks;
import java.util.*;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> temperaturesInformation = new Stack<>();
        int[] daysBeforeAWarmer = new int[temperatures.length];
        for(int i = 0 ; i < temperatures.length ; i++){
            int currTemp = temperatures[i];

            while(!temperaturesInformation.isEmpty() && currTemp > temperaturesInformation.peek()[0]){
                int[] lastTempInfo = temperaturesInformation.pop();
                daysBeforeAWarmer[lastTempInfo[1]] = i - lastTempInfo[1];

            }

            temperaturesInformation.push(new int[] {currTemp , i});
        }
        return daysBeforeAWarmer;
    }
/*

temperatures = [30,38,30,36,35,40,28]
res = []


| 30 , 0 |
*/

}

/*
Daily Temperatures
Solved
You are given an array of integers temperatures where temperatures[i] represents the daily temperatures on the ith day.

Return an array result where result[i] is the number of days after the ith day before a warmer temperature appears on a future day. If there is no day in the future where a warmer temperature will appear for the ith day, set result[i] to 0 instead.

Example 1:

Input: temperatures = [30,38,30,36,35,40,28]

Output: [1,4,1,2,1,0,0]
Example 2:

Input: temperatures = [22,21,20]

Output: [0,0,0]
Constraints:

1 <= temperatures.length <= 1000.
1 <= temperatures[i] <= 100
*/