package interviewprep;

import java.util.LinkedHashSet;

public class uniquechar {
    public static void main(String[] args){

        String str ="esdsdsrsewewnmff";
        //Set<Character> set = new HashSet<>();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for(Character c: str.toCharArray()){
            if(set.add(c)){
                sb.append(c);
            }
        }
     System.out.println(sb);
    }
    
}
