public class palindrome {
    public static void main(String[] args){
        String str ="abaa";
        boolean isPalindrome=true;
        int start=0;
        int end=str.length()-1;
        while(start<end){
        if(str.charAt(start)!=str.charAt(end)){
        isPalindrome=false;
        break;
        }
        start++;
        end--;
    }
    if(isPalindrome){
         System.out.println(str+" is palindrome string");
    }
    else{
         System.out.println(str+" is not a palindrome");
    }
}
    
}
