package interviewprep;

public class evenwordinstr {
    public static void main(String[] args) {
        String str="i love java programming";
        String[] arr=str.split(" ");
        System.out.println("Even length words in the given string are:");
        for(String i : arr){
        
            if(i.length()%2==0)
            {
                System.out.println(i);
            }
        }
    }
    
}
