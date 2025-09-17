package collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class highestfrequency {
    
    public static void main(String[] args){
         String str = "hhrersdhhkklwwrsdsrrr";
        Map<Character, Integer> freqMap = new HashMap<>();
        for(int i=0; i<str.length();i++){
            char current = str.charAt(i);
            if(freqMap.containsKey(current)) continue;
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(j)==current){
                    count++;
                }
            }
            freqMap.put(current, count);
        }
        char maxChar=' ';
        int maxCount=0;
        for(Entry<Character, Integer> entry : freqMap.entrySet()){
            if(entry.getValue()>maxCount){
                maxChar=entry.getKey();
                maxCount=entry.getValue();
            }
        }
         System.out.println("Frequencies: " + freqMap);
        System.out.println("Highest frequency character: " + maxChar + " appears " + maxCount + " times");
    }
}
