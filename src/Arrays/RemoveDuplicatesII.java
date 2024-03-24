package Arrays;

import java.util.HashMap;
import java.util.stream.Collectors;

public class RemoveDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(
                new SolutionRDII().removeDuplicates(nums)
        );

        for (int n : nums){
            System.out.println(n);
        }
    }
}
class SolutionRDII {
    public int removeDuplicates(int[] nums) {
        int pibote = nums[0];
        HashMap<Integer , Integer> NumC = new HashMap<>();
        int conAct = 1;
        for (int i = 1; i < nums.length; i++) {
            if (pibote == nums[i]){
                conAct ++ ;
            }else{
                NumC.put(pibote, conAct);
                conAct = 1;
                pibote = nums[i];
            }
        }
        int counter = 0;
        NumC.put(pibote, conAct); //contiene los diferentes numeros y las veces que se repiten
        for (Integer i : NumC.keySet().stream().sorted().collect(Collectors.toList())) {
            for (int j = 0; j < NumC.get(i) && j < 2; j++) {
                nums[counter] = i;
                counter++;
            }
        }
        return counter;
    }
}
