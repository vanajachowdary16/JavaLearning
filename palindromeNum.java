public class palindromeNum {
public static void main(String[] args){
    int num =121;
    int original = num;
    int reverseNum=0;
    while(num>0){
        
        reverseNum=reverseNum*10+num%10;
        num /=10;
    }
    if(original==reverseNum){
        System.out.println(original+" is a palindrom");
    }else{
       System.out.println(original+" is not a palindrom"); 
    }
}
}
