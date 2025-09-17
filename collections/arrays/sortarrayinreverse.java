package collections.arrays;

import java.util.Arrays;

public class sortarrayinreverse {
    public static void main(String[] args){
    int[] arr={1,5,3,7,2,6};
    //Arrays.sort(arr);
    reverse(arr);
    System.out.println(Arrays.toString(arr));
    
    }
    public static void reverse(int[] a){
        int n= a.length;
        for(int i=0; i<n/2; i++){
            int temp = a[i];
            a[i]=a[n-i-1];
            a[n-i-1] = temp;
        }
    }
}

