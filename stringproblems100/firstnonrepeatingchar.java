package stringproblems100;

import java.util.HashMap;
import java.util.Map;

public class firstnonrepeatingchar {
    public static char firsUniquechar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '\0'; // Return null character if no unique character found
    }
    public static void main(String[] args) {
        String str = "swiss";
        char result = firsUniquechar(str);
        if(result != '\0'){
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
    
}
