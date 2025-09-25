package interviewprep;

public class monotonicArray {
    public static void main(String[] args){
        int[] a ={1,2,3,4};
        boolean increasing=true;
        boolean decreasing = true;
        for(int i=1; i<a.length;i++){
            if(a[i-1]<a[i]){
                decreasing=false;
            }
            else if(a[i-1]>a[i]){
                increasing=false;
            }
        }
       System.out.println(increasing||decreasing);
    }
    
}
