package StringCodings;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesinString {
    public static void main(String[] args){
        String str ="betty bought bitter butter";
        StringBuilder result = new StringBuilder();
        Set<Character> seenchar= new HashSet<>();
        for(char c :str.toCharArray()){
            if(!seenchar.contains(c)){
                result.append(c);
                seenchar.add(c);
                
            }
            
        }
       System.out.println(result);

    }
    
}
