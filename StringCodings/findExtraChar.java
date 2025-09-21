package StringCodings;

import java.util.Arrays;

public class findExtraChar {
    public static void main(String[] args){
        String str1="abfsdsabbcc";
        String str2="abfsds";
        System.out.println(findExtraCharacter(str1, str2));

    }
   public static String findExtraCharacter(String s1, String s2){
    char[] a1 = s1.toCharArray();
    Arrays.sort(a1);
    char[] a2 = s2.toCharArray();
    Arrays.sort(a2);

    StringBuilder extras = new StringBuilder();
    int i=0, j=0;

    while(i < a1.length && j < a2.length){
        if(a1[i] == a2[j]){
            i++; j++;
        } else {
            extras.append(a2[j]); // extra char
            j++;
        }
    }

    // any leftovers in a2
    while(j < a2.length){
        extras.append(a2[j]);
        j++;
    }

    return extras.toString();
}

    
    
}
