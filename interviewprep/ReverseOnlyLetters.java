package interviewprep;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String input = "1ab2ddf3";
        char inputArr[] = input.toCharArray();
        int left = 0;
        int right = inputArr.length-1;
        
        while(left<right){
            if(!Character.isLetter(inputArr[left])){
                left++;
            }else if(!Character.isLetter(inputArr[right])){
                right--;
            }else{
                char temp = inputArr[left];
                inputArr[left]=inputArr[right];
                inputArr[right]=temp;
                left++;
                right--;
            }
        }
        String result = new String(inputArr);
        System.out.println(result);
    }
}
