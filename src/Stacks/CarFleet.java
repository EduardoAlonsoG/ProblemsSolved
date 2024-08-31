package Stacks;
import java.util.*;


public class CarFleet {
        public int carFleet(int target, int[] position, int[] speed) {
            float[][] pairs = new float[position.length][2];

            for(int i = 0; i < position.length ; i++){
                float milesLeft = target - position[i];
                float hoursNeed = milesLeft / speed[i];
                pairs[i][0] = position[i];
                pairs[i][1] = hoursNeed;
            }
            Arrays.sort(pairs, (a, b) -> Double.compare(b[0], a[0]));
            Stack<Float> arrivalOrder = new Stack<>();
            for(int j = 0; j < position.length ; j++){
                if(arrivalOrder.isEmpty()){
                    arrivalOrder.push(pairs[j][1]);
                }
                if(arrivalOrder.peek() < pairs[j][1]){
                    arrivalOrder.push(pairs[j][1]);
                }
            }
            return arrivalOrder.size();


/*public int carFleet(int target, int[] position, int[] speed) {
        float [] hourPerCar = new int[position.length];
        //Set<Integer> hourPerCar = new HashSet<>();

        for(int i = 0; i < position.length ; i++){
            //going trouh each car situation
            int milesLeft = target - position[i];
            float hoursNeed = milesLeft / speed[i];
            //hourPerCar.add(hoursNeed);
            hourPerCar[i] = hoursNeed;
        }

        return hourPerCar.size();
    }*/
    }
/*
target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
car 1:
    milesLeft = 12 - 10 = 2
    hoursNeed = 2 / 2 = 1
car 2:
    milesLeft = 12 - 8 = 4
    hoursNeed = 4 / 4 = 1
car 3:
    milesLeft = 12 - 0 = 12
    hoursNeed = 12 / 1 = 12
car 4:
    milesLeft = 12 - 5 = 7
    hoursNeed = 7 / 1 = 7
car 5:
    milesLeft = 12 - 3 = 9
    hoursNeed = 9 / 3 = 3

    hourPerCar = [1 , 1, 12 , 7 , 3]

*************************************************************************************
target = 10, position = [4,1,0,7], speed = [2,2,1,1]

Car 1:
    milesLeft = 10 - 4 = 6
    hoursNeed = milesLeft / currSpeed  = 6 / 2 = 3

Car 2:
    milesLeft = 9
    hoursNeed = 9 / 2 = 4 + 9%2

Car 3:
    milesLeft = 10
    hoursNeed = 10 / 1 = 10

Car 4:
    milesLeft = 3
    hoursNeed = 3 / 1 = 3

Set hourPerCar = [3 , 5 , 10 , 3]  return hourPerCar.size()

***********************************************************************************
Input: target = 10, position = [1,4], speed = [3,2]

car 1:
    milesLeft = 10 - 1 = 9
    hoursNeed = 9/3 = 3

car 2:
    milesLeft = 10 - 4 = 6
    hoursNeed = 6/2 = 3

-------------------------------------------------------------------------------------


 target = 10, position = [4,1,0,7], speed = [2,2,1,1]
time = 0   ->   [ 4 , 1 , 0 , 7 ]
       1   ->   [ 6 , 3 , 1 , 8 ]
       2   ->   [ 8 , 5 , 2 , 9 ]
       3   ->   [ 10, 7 , 3 , 10]     firtFleet [0] , [3]
       4   ->   [ 12, 9 , 4 , 11]
       5   ->   [ 14, 11 , 5 , 12]    second fleet   [0] , [1] ,  [3]
       6   ->   ==
       7   ->   ==
       8   ->   ==
       9   ->   ==
       10   ->  [ 14, 11 , 10 , 12]    second fleet   [0] , [1]  , [2] ,  [3]
*/

}

/*
Car Fleet
Solved
There are n cars traveling to the same destination on a one-lane highway.

You are given two arrays of integers position and speed, both of length n.

position[i] is the position of the ith car (in miles)
speed[i] is the speed of the ith car (in miles per hour)
The destination is at position target miles.

A car can not pass another car ahead of it. It can only catch up to another car and then drive at the same speed as the car ahead of it.

A car fleet is a non-empty set of cars driving at the same position and same speed. A single car is also considered a car fleet.

If a car catches up to a car fleet the moment the fleet reaches the destination, then the car is considered to be part of the fleet.

Return the number of different car fleets that will arrive at the destination.

Example 1:

Input: target = 10, position = [1,4], speed = [3,2]

Output: 1
Explanation: The cars starting at 1 (speed 3) and 4 (speed 2) become a fleet, meeting each other at 10, the destination.

Example 2:

Input: target = 10, position = [4,1,0,7], speed = [2,2,1,1]

Output: 3
Explanation: The cars starting at 4 and 7 become a fleet at position 10. The cars starting at 1 and 0 never catch up to the car ahead of them. Thus, there are 3 car fleets that will arrive at the destination.

Constraints:

n == position.length == speed.length.
1 <= n <= 1000
0 < target <= 1000
0 < speed[i] <= 100
0 <= position[i] < target
All the values of position are unique.
*/