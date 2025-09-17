package StringCodings;

import java.util.Scanner;

public class palindromeStr {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int start=0;
        int end=str.length()-1;
        boolean isPalindrome=true;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)) {
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome==true)
        {
            System.out.println("the given String is palindrome");
        }
        else{
            System.out.println("the given String is not palindrome");
        }
    }
    
}
