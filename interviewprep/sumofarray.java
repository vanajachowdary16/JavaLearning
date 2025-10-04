package interviewprep;

public class sumofarray {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 4, 5};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
    
}
