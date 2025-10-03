package interviewprep;

public class findmissingnum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4,5,10};
        for(int i=1;i<=arr.length; i++){
            if(arr[i]-arr[i-1]!=1){
                System.out.println(arr[i]-1);
                break;
            }
        }
    }
}
