package StringCodings;

import java.util.Scanner;

public class reverseAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        //String b=" ";
        StringBuilder b= new StringBuilder();
        int n= a.length()-1;
        while(n>=0){
            //b=b+a.charAt(n);
            b.append(a.charAt(n));
            n--;
        }
        String reversed= b.toString();
        System.out.println("reverse string is: " +b);
        if(a.equals(reversed)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    
}

/*
 * String str="string string example reverse";
 * char[] ch = str.toCharArray();
 * int left=0, right=ch.length-1;
 * while(left<right){
 * char temp = ch[left];
 * ch[left]=ch[right];
 * ch[right]=temp;
 * left++;
 * right--;
 * }
 */
