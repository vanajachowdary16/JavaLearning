package interviewprep;

import java.util.HashMap;

public class stringOccurance {
    public static void main(String[] args){
    String str="hello hello world welcome";
    
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<str.length(); i++){
        char ch= str.charAt(i);
         if(ch == ' '){
                continue;
            }
        if(map.containsKey(ch)){
           map.put(ch, map.get(ch) + 1);
        }
        else{
            map.put(ch, 1);
        }
    }
    for(Character k : map.keySet()){
        System.out.println(k+" "+map.get(k));
    }

}
    
}
