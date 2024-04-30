package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(
                new SolutionIS().isIsomorphic(s,t)
        );
    }
}

class SolutionIS{
    public boolean isIsomorphic(String s, String t) {
        Map<Character , Character> tm = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(tm.containsKey(s.charAt(i)) ){
                if(tm.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else if(!tm.containsValue(t.charAt(i))) {
                tm.put(s.charAt(i) , t.charAt(i));
            }else{
                return false;
            }
        }
        return true;
    }
}

/*
Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true

*/