package interviewprep;

public class reversenumber {
    int number=-123;
    int reversenumber=0;
    int lastdigit;
    public void reverse()
    {
        while(number!=0)
        {
            lastdigit=number%10;
            reversenumber=reversenumber*10+lastdigit;
            number=number/10;
        }
        System.out.println("Reversed Number is: "+reversenumber);
    }   
    public static void main(String[] args) {
        reversenumber obj=new reversenumber();
        obj.reverse();
    }

}
