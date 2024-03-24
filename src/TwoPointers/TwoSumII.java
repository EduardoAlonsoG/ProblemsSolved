package TwoPointers;

public class TwoSumII {
    public static void main(String[] args) {
        /*int[] numbers = {5,25,75};
        int target = 100;*/
        int[] numbers = {2,3,4,6,8,11};
        int target = 9;

        for (int number : new SolutionTwoSumII().twoSum(numbers, target) ) {
            System.out.println("result -> " + number);
        }

    }
}

class SolutionTwoSumII{
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int pointerL = 0;
        int pointerR = numbers.length - 1;

        int currSum = 0;

        while(pointerL < pointerR){
            currSum = numbers[pointerL] + numbers[pointerR];
            if(currSum > target){
                pointerR --;
            }else if(currSum < target){
                pointerL ++ ;
            }else{
                result[0] = pointerL + 1;
                result[1] = pointerR + 1;
                return result;
            }
        }

        return result;
    }
}
