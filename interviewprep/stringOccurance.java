package interviewprep;

import java.util.HashMap;
import java.util.Map;

public class stringOccurance {
    public static void main(String[] args){
    String str="hello hello world welcome";
    
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<str.length(); i++){
        char ch= str.charAt(i);
         if(ch == ' '){
                continue;
            }
        map.put(ch, map.getOrDefault(ch, 0)+1); 
    }
    for(Map.Entry<Character, Integer> entry : map.entrySet()){
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }

}
    
}
