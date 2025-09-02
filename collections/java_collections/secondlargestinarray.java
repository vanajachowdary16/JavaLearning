package collections.java_collections;

public class secondlargestinarray {
    public static void main(String[] args){
        int[] arr = {2,4,3,1,5,7,8,9,6,12};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : arr){
            if(num>first){
                second = first;
                first = num;
            }
            else if(num> second && num!=first){
                second = num;
            }
        }
        System.out.println("second largest number is : " +second);
    }
    
}
