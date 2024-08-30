package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElementsInList {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer , Integer> frequences = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];
        for(int num : nums){
            frequences.put(
                    num ,
                    frequences.getOrDefault(num , 0) + 1
            );
        }
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> elementInfo : frequences.entrySet()){
            //En la posicion de la cantidad de coincidencias que se encontraron
            // agregamos el elemento que tiene esa cantidad, por lo que con el primer
            //test case tendriamos lo sigueinte:
            /*
                 [1,2,2 ,2 ,3,3,3 , 5, 5, 6, 6, 6, 6, 6], k = 2
                [ {null} , {1} , {5} , {2,3} ,{null} , {6} ]

                A partir de ese arreglo de listas podemos obtner los indices de los
                numeros que mas se rpiten teniendo encuetna el indice en el que se encuentran
            */
            freq[elementInfo.getValue()].add(elementInfo.getKey());
        }
        int counter = 0;
        for(int i = freq.length - 1; i > 0 && counter < k ; i--){
            //Vamos a recorrer todas las List dentro del arreglo frequences
            for(int numFound : freq[i]){
                result[counter] = numFound;
                counter++;
                if (counter == k) return result;
            }
        }

        return result;
    }
}

/*
Top K Elements in List
Solved
Given an integer array nums and an integer k, return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.

You may return the output in any order.

Example 1:

Input: nums = [1,2,2,3,3,3], k = 2

Output: [2,3]
Example 2:

Input: nums = [7,7], k = 1

Output: [7]
Constraints:

1 <= nums.length <= 10^4.
-1000 <= nums[i] <= 1000
1 <= k <= number of distinct elements in nums.


*/
