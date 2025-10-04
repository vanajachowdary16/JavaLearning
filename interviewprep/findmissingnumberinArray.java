package interviewprep;

public class findmissingnumberinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n=arr.length+1;
        int sumofall= n*(n+1)/2;
        System.out.println(sumofall);
        int sumofArray=0;
        for(int i=0;i<arr.length;i++){
            sumofArray=sumofArray+arr[i];
        }
        System.out.println(sumofArray);
        System.out.println("missing number is: "+(sumofall-sumofArray));   
    }
}
