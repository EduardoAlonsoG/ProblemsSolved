package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "abcddabcdbe";
        System.out.println(new SolutionSSWR().lengthOfLongestSubstring(s));
    }
}
class SolutionSSWR {
    public int lengthOfLongestSubstring(String s) {

        Set subString = new HashSet();
        int lP = 0;
        // lenght of subS = rp - lp
        int maxL = 0;

        for (int rP = 0 ; rP < s.length() ; rP ++){
            while (subString.contains(s.charAt(rP))){
                subString.remove(s.charAt(lP));
                lP++;
            }
            subString.add(s.charAt(rP));
            if(rP - lP + 1 > maxL)
                maxL = rP - lP + 1 ;
        }

        return maxL;
    }
}