public class ValidPalindrome {
    public static void main(String[] args) {
        String[] strings = {
                "A man, a plan, a canal: Panama",   //-> true
                "race a car",                       //-> false
                " ",                                //-> false
                ".,"                                //-> true
        };
        for (String cad : strings){
            System.out.println(
                    new Solution().isPalindrome(cad)
            );
        }
    }
}
class Solution{
//"A man, a plan, a canal: Panama"
    public boolean isPalindrome(String s) {
        int pointerL = 0;
        int pointerR = s.length() - 1;
        do {
            if (!isPrintable(s.charAt(pointerR))) pointerR--;
            else if (!isPrintable(s.charAt(pointerL))) pointerL++;
            else if (s.charAt(pointerL) == s.charAt(pointerR)) {
                pointerR--;
                pointerL++;
            } else {
                return false;
            }
        } while (pointerR > pointerL);
        return true;
    }
    public boolean isPrintable(char c){
        return ((c >= 'a' &&  c <= 'z') || (c >= '0' &&  c <= '9'));
    }
}