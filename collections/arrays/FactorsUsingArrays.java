package collections.arrays;

public class FactorsUsingArrays {
    public static void main(String[] args){
        int num=24;
        int count=0;
        int[] arr = new int[num];
        for(int i=1; i <= num;i++){
            if(num%i==0){
                
                arr[count]=i;
                count++;
            }
        }
        System.out.println("count is" +count);
        System.out.println("the factors are ");
        for(int i=0; i<count; i++){
            System.out.println(arr[i]);
        }
    }
    
}
