package interviewprep;

public class ReverseOnlyVowels {
    public static void main(String[] args) {
        String input = "helloo";
        String vowels = "aeiouAEIOU";
        char inputArr[] = input.toCharArray();
        int left = 0;
        int right = inputArr.length - 1;

        while (left < right) {
            if (vowels.indexOf(inputArr[left])==-1){
                left++;
            } else if (vowels.indexOf(inputArr[right])==-1) {
                right--;
            } else {
                char temp = inputArr[left];
                inputArr[left] = inputArr[right];
                inputArr[right] = temp;
                left++;
                right--;
            }
        }

       System.out.println(new String(inputArr));
    }
}
