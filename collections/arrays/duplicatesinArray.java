package collections.arrays;

import java.util.HashSet;
import java.util.Set;

public class duplicatesinArray {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,1,3,5,6};
        Set<Integer> seenElements = new HashSet<>();
        Set<Integer> duplicateElements= new HashSet<>();
        for(int i : a){
            if(!seenElements.add(i)){
                duplicateElements.add(i);
            }
        }
        System.out.println(duplicateElements);
    }
    
}
