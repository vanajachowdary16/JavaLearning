package StringCodings;

import java.util.Scanner;

public class reverseAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b=" ";
        int n= a.length()-1;
        while(n>=0){
            b=b+a.charAt(n);
            n--;
        }
        System.out.println("reverse string is: " +b);
    }
    
}
