package Arrays;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        return IsAnagramHash(s, t);
    }
    public boolean IsAnagramHash(String s, String t){
        if(s.length() != t.length()) return false;
        Map<Character, Integer> occurrence_S = new HashMap<>();
        Map<Character, Integer> occurrence_T = new HashMap<>();
        for(int i = 0; i < s.length() ; i++){
            occurrence_S.put(s.charAt(i) , occurrence_S.getOrDefault(s.charAt(i) , 0) + 1);
            occurrence_T.put(t.charAt(i) , occurrence_T.getOrDefault(t.charAt(i) , 0) + 1);
        }

        for(Character occ : occurrence_S.keySet()){
            if(occurrence_S.get(occ) != occurrence_T.get(occ)){
                return false;
            }
        }
        return true;

    }
}

/*

s Anagram
Solved
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.


*/
