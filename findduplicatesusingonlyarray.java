public class findduplicatesusingonlyarray{
    public static void main(String[] args){
        int[] arr1 = {2,1,4,3,4,2,1};
        int[] arr2= new int[arr1.length];
        int index=0;
        for(int i=0; i<arr1.length;i++){
            for(int j=i+1; j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    arr2[index]=arr1[i];
                    index++;
                }
            }
        }
        System.out.println("printing duplicate elements: ");
        for(int i=0; i<index;i++){
            System.out.println(arr2[i]);
        }
    }
}