package stringproblems100;

import java.util.Scanner;

public class palindromeStr {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int left=0;
        int right=str.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)) {
                isPalindrome=false;
                break;
            }
            left++;
            right--;
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
