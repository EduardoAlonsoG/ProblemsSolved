package TwoPointers;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "aksdcbc";
        System.out.println(
                new SolutionSubsequence().isSubsequence(s,t)
        );
    }
}

class SolutionSubsequence {
    public boolean isSubsequence(String s, String t) {
        int pointerL_s = 0;
        int pointerL_t = 0;

        while(pointerL_t < t.length() && pointerL_s < s.length() ){
            if(s.charAt(pointerL_s) == t.charAt(pointerL_t)){
                pointerL_t++;
                pointerL_s++;
            }else{
                pointerL_t++;
            }
        }
        return (pointerL_s == s.length());
    }
}