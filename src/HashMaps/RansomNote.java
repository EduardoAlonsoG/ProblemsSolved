package HashMaps;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "abacav";
        String magaszine = "bcv";
        System.out.println(
                new SolutionRN().canConstruct(ransomNote , magaszine)
        );
    }
}

class SolutionRN {
    public boolean canConstruct(String ransomNote, String magazine) {
        //every character in ransomNote must to apear into magazine
        //Start creating a hash map for every character in ransomNote
        //and then we're goint to remove every coincidence in magazine, until map is null

        HashMap<Character , Integer> mapRN = new HashMap<>();
        for (Character c: magazine.toCharArray()){
            if(mapRN.containsKey(c)){
                mapRN.put(c , mapRN.get(c) + 1);
            }else{
                mapRN.put(c, 1);
            }
        }

        for(Character cR : ransomNote.toCharArray()){
            if(mapRN.containsKey(cR)){
                if(mapRN.get(cR) == 1){
                    mapRN.remove(cR);
                }else{
                    mapRN.put(cR , mapRN.get(cR)- 1);
                }
            }else{
                return false;
            }
        }
        // O(ransomNote.length + magazine.length)
        return true;
    }
}

/*
Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
*/