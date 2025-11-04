package interviewprep;

public class reverseString {
    public static void main(String[] args) {
    String str ="jaavaa programming";
    char[] ch = str.toCharArray();
    int left=0;
    int right=str.length()-1;
    while(left<right){
        char temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        left++;
        right--;
    }
    System.out.println(new String(ch));
    
}
}

