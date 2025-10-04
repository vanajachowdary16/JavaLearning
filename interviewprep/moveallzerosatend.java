package interviewprep;

public class moveallzerosatend {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int nonZeroValue=0;
        int temp;
        for(int current=0 ; current<arr.length; current++){
            if(arr[current]!=0){
                temp=arr[nonZeroValue];
                arr[nonZeroValue]=arr[current];
                arr[current]=temp;
                nonZeroValue++;
        }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }   
    }
    
}
