/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author egarcia
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0,0,3,3};
        //0,0,1,1,1,2,2,3,3,4
        new Solution3().removeDuplicates2(nums);
    }
}

class Solution3{
    
    public int removeDuplicates2(int[] nums) {
        
        int pibote = nums[0];
        HashMap <Integer , Integer> NumC = new HashMap<>();
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
        imprimeNums(nums , counter);
        return counter;
    }
    
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        
        int pibote = 0;
        int actualPos = 0;
        int changed = nums[0]; 
        
        while(actualPos < nums.length-1){
        
            while(changed >= nums[actualPos] && actualPos < nums.length-1){
                actualPos++; 
                if(nums[actualPos] == changed) k--;
            }
            pibote++;
            
        
            changed = nums[actualPos];
            int temp = nums[pibote];
            nums[pibote] = nums[actualPos];
            nums[actualPos] = temp;
        
        }
        
        
        return k;
    }
    
    public void imprimeNums(int[] nums, int k){
        for (int numero : nums) {
            System.out.println(numero);
        }
        System.out.println("Resultado retornado: " + k);
    }
}
