package interviewprep;

public class PangramString {
    public static void main(String[] args){
        String str = "The quick brown fox jumps over the lazy dog";
        str=str.toLowerCase();
        System.out.println(str);
        if(checkPangram(str)){
            System.out.println("The given string is a pangram");
    }
}
    public static boolean checkPangram(String str){
        boolean[] mark = new boolean[26];
        int index =0;
        if(str.length() < 26){
            return false;
        }
       for(char i='a'; i<='z';i++){
          if(str.indexOf(i) <0){
              return false;
           }
       
        }
        return true;
    } 
    
}
