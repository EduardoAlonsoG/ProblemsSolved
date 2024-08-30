package Arrays;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<String> seen = new HashSet<>();
        String numberToString = Integer.toString(n);
        while(!numberToString.equals("1")){
            if(!seen.add(numberToString))
                return false;
            numberToString = computeNumbers(numberToString);
        }
        return true;
    }
    public String computeNumbers(String numbertoString){
        //split the digits and get the sum of the squares
        int sum = 0;
        for(int i = 0; i < numbertoString.length() ; i++){
            int digito = Character.getNumericValue(numbertoString.charAt(i));
            sum += Math.pow(digito, 2);
        }
        return Integer.toString(sum);
    }
}

/*

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.



Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false


Constraints:

1 <= n <= 231 - 1
*/
