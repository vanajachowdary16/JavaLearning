import java.util.Arrays;

class ArrayLearning{
    public static void main(String[] args){
        int[] numbers={2,4,6,8,9,3};
        int[] arr2 = new int[numbers.length];
        int sum =0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
            arr2[i]=sum;
        }
        System.out.println(Arrays.toString(arr2));
    }

}
