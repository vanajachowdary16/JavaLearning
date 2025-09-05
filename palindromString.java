public class palindromString {
    public static void main(String[] args){
       String test = "mam" ;
       System.out.println(isPalindrome(test));
    }
    public static boolean isPalindrome(String str){

        
        String reversedStr = new StringBuffer(str).reverse().toString();
        return str.equalsIgnoreCase(reversedStr);
    }
    
}
