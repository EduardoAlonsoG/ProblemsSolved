package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> s1Info = new HashMap<>();
        Map<Character,Integer> s2Info = new HashMap<>();

        for(Character c:   s1.toCharArray()){
            s1Info.put(c , s1Info.getOrDefault(c , 0) +1 );
        }
        for(Character c :  s2.toCharArray()){
            s2Info.put(c , 0);
        }
        int sWin = 0;

        for(int eWin = 0 ; eWin < s2.length() ; eWin++ ){
            s2Info.put(s2.charAt(eWin) , s2Info.getOrDefault(s2.charAt(eWin) , 0) + 1 );


            if(eWin - sWin + 1 == s1.length()){
                // compararamos los matches
                if(compareMatches(s1Info, s2Info)) return true;

                s2Info.put(
                        s2.charAt(sWin) ,
                        s2Info.get(s2.charAt(sWin)) - 1
                );

                sWin++;
            }
        }
        return false;
    }

    private boolean compareMatches(Map<Character, Integer> s1Info, Map<Character, Integer>  s2Info){
        for(Map.Entry<Character, Integer> entry : s1Info.entrySet()){
            if(entry.getValue() != s2Info.get(entry.getKey())) return false;
        }
        return true;
    }
}

/*
"abc", s2 = "lecaabee"
                abc
*/

