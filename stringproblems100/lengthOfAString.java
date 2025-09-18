package stringproblems100;

public class lengthOfAString {
    public static void main(String[] args){
        String str ="lengthExample";
        char[] ch = str.toCharArray();
        int lenth=0;
        for(char c :ch ){
            lenth++;
        }
        System.out.println(lenth);
    }
    
}
