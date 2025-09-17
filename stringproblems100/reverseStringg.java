package stringproblems100;

public class reverseStringg {
    public static void main(String[] args){
        String str ="stringgexample";
        String b=" ";
        int n=str.length()-1;
        while(n>=0){
            b=b+str.charAt(n);
            n--;
        }
System.out.println("reversed String is "+b);
    }
}
