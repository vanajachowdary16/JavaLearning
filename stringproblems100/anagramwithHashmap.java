package stringproblems100;

import java.util.HashMap;

public class anagramwithHashmap {
    public static void main(String[] args) {
        String str1 ="listen";
        String str2 ="silent";
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("not anagram");
            return;
        }   
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<str1.length();i++){

            //int currentA= ;
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
            //int currentB= map2.getOrDefault(str2.charAt(i),0);
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1); 
        }
        if(map1.equals(map2)){
            System.out.println("anagram");  
        
    }   else{
        System.out.println("not anagram");
       }
}
    
}
