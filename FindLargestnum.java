public class FindLargestnum {
    public static void main(String[] args){
        int[] arr1={1,9,3,5,6,2,8};
        int largest=arr1[0];
        for(int num: arr1){
            if(num>largest){
                largest=num;
            }
        }
        System.out.println("largest number of array is : " +largest);
    }
    
}
