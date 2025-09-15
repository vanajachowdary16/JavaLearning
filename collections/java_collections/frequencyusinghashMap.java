package collections.java_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class frequencyusinghashMap
 {
    public static void main(String[] args){
        String str = "hrewhhawwehhllAMM";
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char ch : str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        char maxChar =' ';
        int maxfreq =0;
        for(Entry<Character, Integer> entry : freqMap.entrySet()){
            if(entry.getValue()>maxfreq){
                maxChar=entry.getKey();
                maxfreq = entry.getValue();
            }

        }
                System.out.println("Highest frequency character: '" + maxChar + "' occurred " + maxfreq + " times.");

        
    }
    
}
