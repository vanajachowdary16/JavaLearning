package collections;

import java.util.ArrayList;

public class FactorsusingArrayList {
    public static void main(String[] args) {
        int num = 24;
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);  // directly add factor
            }
        }

        // print results
        System.out.println("The number of factors of " + num + " is: " + factors.size());
        System.out.print("Factors are: " + factors);
    }
    
}
