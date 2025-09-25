package interviewprep;

public class maxright {
    public static void main(String[] args){
        int[] a={16,17,4,5,3,2};
        int length=a.length;
        int maxRight= a[length-1];
        System.out.println(maxRight);
        for(int i=length-2; i>=0;i--){
            if(a[i]>maxRight){
                maxRight=a[i];
                System.out.println(maxRight);
            }
        }
         System.out.println("max right leading number is: "+maxRight);
    }
    
}
