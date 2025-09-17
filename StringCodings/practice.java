package StringCodings;

public class practice {

    public static void main(String[] args){
        String str= "findlength";
        char[] ch = str.toCharArray();
        int lenth=0;
        for(char c:ch){
            lenth++;
        }
        System.out.println("string lenght is "+lenth);
    }
    
}
