package HashMaps;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(
                new SolutionGA().groupAnagrams(strs).toString()
        );
    }
}
// pending to improve
class SolutionGA{
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> groupingMap = new HashMap<>();

        for(String word : strs){
            char[] wordC = word.toCharArray();
            Arrays.sort(wordC);
            String sSorted = new String(wordC);
            List<String> temp = new ArrayList<>();
            if(groupingMap.containsKey(sSorted)){
                temp = groupingMap.get(sSorted);
                temp.add(word);
            }else{
                temp.add(word);
            }

            groupingMap.put(sSorted,temp);
        }
        return groupingMap.values().stream().toList();
    }
}
/*
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

*/